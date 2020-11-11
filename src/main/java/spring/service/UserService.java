package spring.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import spring.dao.UserMapper;
import spring.pojo.*;
import spring.pojo.AoyoCommodityImg;
import spring.pojo.User;
import spring.pojo.AoyoCommoditySuit;
import spring.pojo.AoyoPlatformImage;
import spring.response.BaseResponse;
import spring.response.StatusCode;
import spring.utils.EncryptUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Service
public class UserService {

    private static final Logger log= LoggerFactory.getLogger(UserService.class);
    @Resource
    UserMapper userMapper;

    @Autowired
    private ObjectMapper objectMapper;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /*登录*/
    public User login(User user) {
        return userMapper.login(user);
    }


    public List<AoyoProvince> selectedProv() {

        return userMapper.setlectedProv();
    }

    public List<AoyoCity> selectCity(Integer asd) {
        return userMapper.selectCity(asd);
    }

    public List<AoyoArea> selectAreas(String asd) {
        return userMapper.selectAreas(asd);
    }

    public List<AoyoAddressLabel> selectAddLabelAll() {return userMapper.selectAddLabelAll();
    }

    public int addressInsert(AoyoAddress aoyoAddress) {

        return userMapper.addressInsert(aoyoAddress);
    }
    /*活动图片查询*/
    public List<AoyoPlatformImage> hudong() {
        return userMapper.huodong();
    }

    /*保养套餐查询*/
    public List<AoyoCommoditySuit> taocan() {
        return userMapper.taocan();
    }

    /*轮播图查询*/
    public List<AoyoCommodityImg> lunbo() {
        return userMapper.lunbo();
    }


    /*优惠券查询*/
    public List<AoyoCoupon> youhuiquan() {
        return userMapper.youhuiquan();
    }

    /*首页分类查询*/
    public List<AoyoPanel> fenlei() {
        return userMapper.fenlei();

    }

    /*购物车列表查询*/
    public List<Goshopping> goshopping() {
        return userMapper.goshopping();
    }

    /*关注商品查询*/
    public List<GuanZhuShop> guanzhushop() {
        return userMapper.guanzhushop();
    }

    /*个人中心优惠券查询*/
    public List<AoyoCoupon> myyouhuiquan() {
        return userMapper.myyouhuiquan();
    }




    //登录成功生成token
    public AuthTokenModel authUserAndCreateToken(String mobile) throws Exception {

        AoyoCustom aoyoCustom = userMapper.moblieLogin(mobile);

        if(aoyoCustom!=null){

            AccessTokenDto accessTokenDto = new AccessTokenDto();
            accessTokenDto.setUserId(aoyoCustom.getCustomId());
            accessTokenDto.setUserName(aoyoCustom.getNickname());
            accessTokenDto.setMobile(aoyoCustom.getMobile());
            accessTokenDto.setTimestamp(System.currentTimeMillis());
            accessTokenDto.setRandomStr(Constant.snowFlake.nextId().toString());
            accessTokenDto.setExpire(Constant.ACCESS_TOKEN_EXPIRE);

            //把Josn格式转换为字符串String jsonStr=objectMapper.writeValueAsString(tokenDto);
            String jsonStr = objectMapper.writeValueAsString(accessTokenDto);

            //给定一个秘钥给字符串加密
            String s = EncryptUtil.aesEncrypt(jsonStr, Constant.TOKEN_AUTH_KEY);

            //添加到缓存
            ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();

            stringStringValueOperations.set(Constant.TOKEN_REDIS_KEY_PREFIX+mobile,jsonStr,Constant.ACCESS_TOKEN_EXPIRE, TimeUnit.MILLISECONDS);

            log.info("从缓存中去出来："+Constant.TOKEN_REDIS_KEY_PREFIX+mobile);

            AuthTokenModel tokenModel=new AuthTokenModel(jsonStr,Constant.ACCESS_TOKEN_EXPIRE);
            return tokenModel;
        }

        return null;
    }

    public AoyoCustom moblieLogin(String mobile) {

        return userMapper.moblieLogin(mobile);
    }


    /**
     * 将信息响应回去
     * @param response
     * @param message
     */
    public void print(HttpServletResponse response, Object message){
        try {
            response.setStatus(HttpStatus.OK.value());
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            response.setHeader("Cache-Control", "no-cache, must-revalidate");
            PrintWriter writer = response.getWriter();
            writer.write(objectMapper.writeValueAsString(message));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 验证token
     * @param accessToken
     * @return
     */
    public BaseResponse validateToken(String accessToken) {

        BaseResponse response=new BaseResponse(StatusCode.Success);

        try{

            if (StringUtils.isBlank(accessToken)){

                return new BaseResponse(StatusCode.AccessTokenNotBlank);
            }

            AccessTokenDto accessTokenDto;

            try {
                accessTokenDto = parseAccessToken(accessToken);
            }catch (Exception e){
                return new BaseResponse(StatusCode.AccessTokenInvalidate);
            }

            //从缓存中验证这个token是否存在
            String redisKey =   Constant.TOKEN_REDIS_KEY_PREFIX+accessTokenDto.getMobile();
            String s = stringRedisTemplate.opsForValue().get(redisKey);
            AuthToken authToken = objectMapper.readValue(s, AuthToken.class);
            if(accessToken == null){
                return new BaseResponse(StatusCode.AccessTokenNotExist);
            }
            if(accessTokenDto!=null){
                //判断token是否过期
                if (System.currentTimeMillis() - accessTokenDto.getTimestamp() > accessTokenDto.getExpire()){

                    //失效token
                    this.invalidateByAccessToken(accessToken,accessTokenDto.getMobile());

                    return new BaseResponse(StatusCode.TokenValidateExpireToken);
                }
            }


        }catch (Exception e){

            return new BaseResponse(StatusCode.Fail,e.getMessage());
        }

        return response;
    }

    /**
     * 解析token
     * @param accessToken
     * @return
     */
    public AccessTokenDto parseAccessToken(String accessToken) throws Exception {

        String tokenJsonStr = EncryptUtil.aesDecrypt(accessToken, Constant.TOKEN_AUTH_KEY);
        return objectMapper.readValue(tokenJsonStr,AccessTokenDto.class);
    }


    /**
     * 失效token
     * @param accessToken
     */
    public void invalidateByAccessToken(String accessToken,String moblie
    ) {

        if (StringUtils.isNotBlank(accessToken)){

            stringRedisTemplate.delete(Constant.TOKEN_REDIS_KEY_PREFIX+moblie);
        }

    }

    public AoyoCustom selectByCustomId(String customId) {

        return userMapper.selectByCustom(customId);
    }

    public int successCustomUp(AoyoCustom aoyoCustom) {

        return userMapper.successCustomUp(aoyoCustom);
    }

    public List<MyAddressList> selectShowOder(String customID) {

        return userMapper.selectShowOder(customID);
    }

    //    查询所有地址
    public List<MyAddressList> queryCustomAddress(String customId) {

        return userMapper.queryCustomAddress(customId);
    }

    /*购物车列表查询升级版*/
    public List<Goshopping> goshoppings() {
        return userMapper.goshoppings();
    }

    public int upDefaultAddress(long customId) {
        return userMapper.upDefaultAddress(customId);
    }

    public int deleAddress(String addressId) {
        return userMapper.deleAddress(addressId);
    }
}

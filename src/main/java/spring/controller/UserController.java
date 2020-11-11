package spring.controller;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.OSSObject;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import spring.pojo.*;
import spring.response.BaseResponse;
import spring.service.UserService;
import spring.response.StatusCode;
import spring.utils.AliyunOSSUtil;
import spring.utils.HttpClientUtil;
import spring.utils.ImageUtils;
import spring.utils.OSSProperties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

//用户
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;


    //奥德赛 董莽修改
    @RequestMapping("login")
    public String login(User user, HttpSession session) {
        System.out.println("进来了");
        User user1 = userService.login(user);
        if (user1 != null) {
            session.setAttribute("USER", user1);
            return "index";
        } else {
            return "login";
        }
    }

    /*轮播图查询*/
    @RequestMapping("lunbo")
    @ResponseBody
    public BaseResponse lunbo(){
        List<AoyoCommodityImg> list = userService.lunbo();
        return new BaseResponse(200,"成功！",list);
    }

    /*活动图查询*/
    @RequestMapping("huodong")
    @ResponseBody
    public BaseResponse huodong(){
        List<AoyoPlatformImage> list = userService.hudong();
        return new BaseResponse(200,"成功！",list);
    }

    /*保养套餐查询*/
    @RequestMapping("taocan")
    @ResponseBody
    public BaseResponse taocan(){
        List<AoyoCommoditySuit> list = userService.taocan();
        return new BaseResponse(200,"成功！",list);
    }



    //查询所有的省
    @RequestMapping("selectProv")

    public List<AoyoProvince> selectedProv(){

        return userService.selectedProv();
    }

    /*selectCity*/
    @RequestMapping("selectCity")

    public List<AoyoCity> selectCity(Integer asd){
        System.out.println(asd+"_____________________________");

        return userService.selectCity(asd);
    }

    /*selectareas*/
    @RequestMapping("selectAreas")

    public List<AoyoArea> selectAreas(String asd){
        System.out.println(asd+"_____________________________");

        return userService.selectAreas(asd);
    }

    /*查询所有的标签页*/
    @RequestMapping("selectAddLabelAll")
    public List<AoyoAddressLabel> selectAddLabelAll( ){

        return userService.selectAddLabelAll();
    }

    /*添加新的地址简直是太难了*/
    @RequestMapping("addressInsert")
    public BaseResponse addressInsert(AoyoAddress aoyoAddress){

        System.out.println(aoyoAddress.toString());

        int i  = userService.addressInsert(aoyoAddress);
        if(i>0){
            return  new BaseResponse(StatusCode.Success,i);
        }

        return new BaseResponse(StatusCode.Fail,i);
    }

    /*首页优惠券查询*/
    @RequestMapping("youhuiquan")
    @ResponseBody
    public BaseResponse youhuiquan(){
        List<AoyoCoupon> list = userService.youhuiquan();
        return new BaseResponse(200,"成功！",list);
    }


    /*首页分类查询*/
    @RequestMapping("fenlei")
    @ResponseBody
    public BaseResponse fenlei(){
        List<AoyoPanel> list = userService.fenlei();
        return new BaseResponse(200,"成功！",list);
    }

    /*购物车列表查询*/
    @RequestMapping("goshopping")
    @ResponseBody
    public BaseResponse goshopping(){
        List<Goshopping> list = userService.goshopping();
        return new BaseResponse(200,"成功！",list);
    }

    /*购物车列表查询升级版*/
    @RequestMapping("goshoppings")
    @ResponseBody
    public BaseResponse goshoppings(){
        List<Goshopping> list = userService.goshoppings();
        return new BaseResponse(200,"成功！",list);
    }

    /*关注商品查询*/
    @RequestMapping("guanzhushop")
    @ResponseBody
    public BaseResponse guanzhushop(){
        List<GuanZhuShop> list = userService.guanzhushop();
        return new BaseResponse(200,"成功！",list);
    }

    /*个人中心优惠券查询*/
    @RequestMapping("myyouhuiquan")
    @ResponseBody
    public BaseResponse  myyouhuiquan(){
        List<AoyoCoupon> list = userService.myyouhuiquan();
        return new BaseResponse(200,"成功！",list);
    }



    //发送验证码
    @RequestMapping("SendSmCode")
    @ResponseBody
    public BaseResponse SendSmCode(String moblie, String vcode){

        HashMap<Object, Object> map = new HashMap<>();

        String code = RandomStringUtils.randomNumeric(4);
        System.out.println(code+"验证码");
        map.put("code",code);

        return new BaseResponse(StatusCode.Success,map);
    }



    //    判断是否登录
    @RequestMapping("ifloginCon")
    @ResponseBody
    public BaseResponse ifloginCon(HttpServletRequest request, String customId){

        String ltoken = request.getHeader("Ltoken");

        if(StringUtils.isBlank(ltoken)){

            System.out.println("当前token时空");
            return  new BaseResponse(StatusCode.CurrUserNotLogin);
        }

        System.out.println("不为空");
        HashMap hashMap = new HashMap();
        AoyoCustom aoyoCustom = userService.selectByCustomId(customId);
        hashMap.put("aoyo",aoyoCustom);

        System.out.println(customId+"查询个人信息："+aoyoCustom.toString());

        return new BaseResponse(StatusCode.Success,hashMap);
    }



    /*根据手机进行登录并且存入token*/
    @RequestMapping("loginCon")
    @ResponseBody
    public BaseResponse loginCon( String mobile){
        System.out.println(mobile);

        HashMap<Object, Object> map = new HashMap<>();

        //判断是否为空
        if(StringUtils.isBlank(mobile)){
            return new BaseResponse(StatusCode.UserMobileNotBlank);
        }

        BaseResponse<AuthTokenModel> baseResponse = new BaseResponse<>(StatusCode.Success);

        try {
            System.out.println("进来了------------");

            AoyoCustom aoyoCustom = userService.moblieLogin(mobile);
            AuthTokenModel authTokenModel = userService.authUserAndCreateToken(mobile);
            map.put("token",authTokenModel);
            map.put("custom",aoyoCustom);

            //登录并且创建token
            baseResponse.setData(map);

        }catch (Exception e){

            return new BaseResponse<>(StatusCode.Fail.getCode(),e.getMessage());
        }

        return baseResponse;
    }


    // queryCustomAddress所有地址
    @RequestMapping("queryCustomAddress")
    @ResponseBody
    public BaseResponse queryCustomAddress(String customId){

        List<MyAddressList> myAddressLists = userService.queryCustomAddress(customId);

        System.out.println("进来查询所有地址");
        return new BaseResponse(StatusCode.Success,myAddressLists);
    }





    //修改个人信息

    @RequestMapping("successCustom")
    @ResponseBody
    public BaseResponse successCustom(AoyoCustom aoyoCustom){

        System.out.println("修个个人信息："+aoyoCustom.toString());
        int i = userService.successCustomUp(aoyoCustom);

        return new BaseResponse(StatusCode.Success,i);
    }



    //查询所有订单
    @ResponseBody@RequestMapping("selectShowOder")
    public  BaseResponse SelecOderAll(String customID){

        List<MyAddressList> list = userService.selectShowOder(customID);

        return  null;
    }





    //    实名认证
    @RequestMapping("uploadBackIdentityImg")
    @ResponseBody
    public BaseResponse uploadBackIdentityImg(HttpServletRequest request){

        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

        //对应前端的upload的name参数"file"
        MultipartFile multipartFile = req.getFile("file");
        String originalFilename = request.getSession().getServletContext().getRealPath("/") + "upload/01";

        //取得图片的格式后缀
        String originalLastName = multipartFile.getOriginalFilename();
        String picLastName = originalLastName.substring(originalLastName.lastIndexOf("."));

        OSSObject ossObject = null;

        HashMap map = new HashMap();

        //定义名称跟路径
        String format = "shiming/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date())+picLastName;
        try {
            File file = new File(originalFilename);

            multipartFile.transferTo(file);

            String upload = AliyunOSSUtil.upload(file, format);
            String substring = upload.substring(47);

            //创建一个服务器
            OSSClient ossClient = new OSSClient(OSSProperties.ALIYUN_ENDPOINT, OSSProperties.ALIYUN_ACCESS_ID, OSSProperties.ALIYUN_ACCESS_KEY);

            // ossObject包含文件所在的存储空间名称、文件名称、文件元信息以及一个输入流。
            ossObject = ossClient.getObject(OSSProperties.ALIYUN_BUCKET, substring);

            //对图片进行base64位编码
            String s = ImageUtils.encodeImgageToBase64(ossObject.getObjectContent());

            map = new HashMap();
            map.put("key","3c457b1283fcc1355c6cc400814352e5");
            map.put("image",s);
            map.put("side","front");
            map.put("fileUrl",upload);

            String   s1 = HttpClientUtil.doPost("http://apis.juhe.cn/idimage/verify", map);

            return new BaseResponse(StatusCode.Success,s1);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }












}

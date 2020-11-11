package spring.pojo;

import lombok.Data;

/**
 * 展示全部s收货地址
 * 自定义的Pojo
 */
@Data
public class MyAddressList {


    private String customId;
    private String consigneeName;//收货人名称
    private String telephone;//收货人手机号
    private String Shengname ;//省名称
    private String ShiName ;//市名称
    private String XianName ;//县名称
    private String labelName;// 家  学校  公司
    private String defaultAddress;//默认地址
    private String addressId;//地址id


}

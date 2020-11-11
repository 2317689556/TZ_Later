package spring.pojo;

import lombok.Data;

@Data
public class CarBrand {
    private Integer carBrandId;//汽车品牌ID
    private String carBrandInitials;//首字母
    private String carBrandName;//汽车品牌名称
    private String carBrandUrl;//图标
    private Integer deleteFlag;//删除标识符号（默认1）  1：有效，0：无效
    private String carBrandNatiName;//车辆归属地
    private Integer carBrandParentId;//父级品牌ID
    private String carBrandPyFirstLetter;//首字母
}

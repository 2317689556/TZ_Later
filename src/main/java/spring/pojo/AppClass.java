package spring.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AppClass extends AoyoCommodity{
    private Integer appClassId;//app分类id
    private String appClassName;//app分类名称
    private String appClassDesc;//app分类描述
    private Date createTime;//创建时间
    private Integer appClassStatus;//状态
    //private Integer deleteFlag;//删除键
}

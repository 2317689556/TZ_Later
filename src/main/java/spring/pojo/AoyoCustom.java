package spring.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCustom {

  private long customId;
  private String nickname;
  private String name;
  private String photo;
  private String mobile;
  private String wxPubOpenid;
  private String wxUnionid;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String deleteDesc;
  private long statusId;
  private long deleteFlag;
  private String wxAppletOpenid;
  private long customOriginId;
  private String customGender;


  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern="yyyy-MM-dd HH:mm")
  private Date customBirthday;

}

package spring.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class Consignedprocessing {
  private long id;
  private String name;
  private String model;
  private String specification;
  private String batchNumber;
  private java.sql.Timestamp inboundDate;
  private String manufacturers;
  private long num;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isActive;
  private long stockId;
  private String wtdw;
  private String sbmc;
  private String sbsl;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat
  private java.sql.Timestamp zqsj;
  private java.sql.Timestamp date;
  private Integer unit;
  private Integer count;
  private long unitPrice;
  private Integer money;
}

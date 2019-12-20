package spring.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class Consignedprocessing {
  private long id;
  private String name;//品名
  private String model;//型号
  private String specification;//规格
  private String batchNumber;
  private java.sql.Timestamp inboundDate;
  private String manufacturers;
  private long num;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long isActive;
  private long stockId;
  private String wtdw;//委托单位
  private String sbmc;//设备名称
  private String sbsl;//设备数量
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat
  private java.sql.Timestamp zqsj;//周期时间
  private java.sql.Timestamp date;//日期
  private Integer unit;//单位
  private Integer count;//数量
  private long unitPrice;//单价
  private Integer money;//金额
}

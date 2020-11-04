package spring.pojo;

import lombok.Data;

@Data
public class AoyoCommodityComment {

  private Integer commodityCommentId;
  private Integer commodityId;
  private Integer orderId;
  private Integer customId;
  private String commodityCommentTitle;
  private String commodityCommentContent;
  private String commodityCommentTime;
  private String commodityCommentLastupdateTime;
  private String commodityCommentRemarks;
  private Integer deleteFlag;


}

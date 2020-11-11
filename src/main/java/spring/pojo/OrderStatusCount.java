package spring.pojo;

import lombok.Data;

@Data
public class OrderStatusCount {
    private Integer  pendingPayment;
    private Integer  processing;
    private Integer  comment;
    private Integer  completed;
    private Integer  all;
}


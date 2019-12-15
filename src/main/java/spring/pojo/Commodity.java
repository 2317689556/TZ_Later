package spring.pojo;


import lombok.Data;

@Data
public class Commodity {
    private Integer id;
    private String model;
    private String name;
    private String specification;
    private String unit;
    private Integer unitPrice;
    private String manufacturers;
    private String productLine;
    private String batchNumber;
    private Integer money;
    private Integer moneyOut;
    private Integer moneyInput;
    private Integer stockId;
}

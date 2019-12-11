package spring.pojo;


import lombok.Data;

@Data
public class Commodity {
    private long id;
    private String name;
    private String model;
    private long specification;
    private long unit;
    private String manufacturers;
    private String productLine;
    private String batchNumber;
    private long money;
    private long moneyInput;
    private long moneyOut;
    private long stockoutId;
}

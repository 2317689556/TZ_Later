package spring.pojo;


import lombok.Data;

@Data
public class Commodity {
    private Integer id;
    private String model;/*型号*/
    private String name;/*品名*/
    private String specification;/*规格*/
    private String unit;/*单位*/
    private Integer unitPrice;
    private String manufacturers;/*厂家*/
    private String productLine;/*产品线*/
    private String batchNumber;/*生产批号*/
    private Integer money;/*总价*/
    private Integer moneyOut;/*出库价格*/
    private Integer moneyInput;/*入库价格*/
    private Integer stockId;
}

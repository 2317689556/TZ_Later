package spring.pojo;


import lombok.Data;

@Data
public class SurgicaldrapeDetails extends Surgicaldrape {
    private long id;
    private String name;
    private String model;
    private String specification;
    private String unit;
    private long count;
    private long unitPrice;
    private long money;
    private long stockoutId;
    private long sumcount;
}

package ie.cct.gergarage.domain;

import javax.persistence.*;

@Entity
@Table(name = "supply")
public class Supply {

    @Id
    @Column(name = "partid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer partid;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "partname")
    private String partname;

    @Column(name = "instock")
    private Boolean instock;

    public Supply() {
    }

    public Integer getPartid() {
        return partid;
    }

    public void setPartid(Integer partid) {
        this.partid = partid;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getPartname() {

        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public Boolean getInstock() {
        return instock;
    }

    public void setInstock(Boolean instock) {
        this.instock = instock;
    }
}

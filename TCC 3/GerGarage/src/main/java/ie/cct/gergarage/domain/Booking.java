package ie.cct.gergarage.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name = "bookingid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookingid;

    @Column(name = "bookingtype")
    private String bookingtype;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "bookingdate")
    private LocalDate bookingdate;

    @ManyToOne
    @JoinColumn(name="mechanicid")
    private Mechanic mechanic;

    @ManyToOne
    @JoinColumn(name="customerid")
    private Customer customer;

    @Column(name = "progress")
    private String progress;

    public Booking() {
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public String getBookingtype() {
        return bookingtype;
    }

    public void setBookingtype(String bookingtype) {
        this.bookingtype = bookingtype;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public LocalDate getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(LocalDate bookingdate) {
        this.bookingdate = bookingdate;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}

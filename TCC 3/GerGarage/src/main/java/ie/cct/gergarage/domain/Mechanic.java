package ie.cct.gergarage.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "mechanic")
public class Mechanic {


    @Id
    @Column(name = "mechanicid")

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mechanicid;

    @Column(name = "mechanicname")
    private String mechanicName;

    @Column(name = "mechanicphone")
    private String mechanicPhone;

    @Column(name = "availability")
    private Boolean availability;
    @JsonIgnore
    @OneToMany(mappedBy = "mechanic",fetch = FetchType.LAZY)
    private List<Booking> booking;

    public Mechanic() {
    }

    public Integer getMechanicid() {
        return mechanicid;
    }

    public void setMechanicid(Integer mechanicid) {
        this.mechanicid = mechanicid;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public String getMechanicPhone() {
        return mechanicPhone;
    }

    public void setMechanicPhone(String mechanicPhone) {
        this.mechanicPhone = mechanicPhone;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public List<Booking> getBooking() {
        return booking;
    }

    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }
}

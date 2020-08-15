package ie.cct.gergarage.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "customerid")

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerid;
	
	@Column(name = "customername")
	private String customername;

	@Column(name = "customeremail")
	private String customeremail;

	@Column(name = "customerphone")
	private String customerphone;

	@Column(name = "vehicletype")
	private String vehicletype;

	@Column(name= "vehiclemake")
	private String vehiclemake;

	@Column(name = "vehiclelicense")
	private String vehiclelicense;

	@Column(name = "vehiclefuel")
	private String vehicleFuel;

	@Column(name = "commentary")
	private String commentary;

	@Column(name = "access")
	private Boolean access;

	@Column(name = "customerlogin")
	private String customerlogin;

	@Column(name = "customerpassword")
	private String customerpassword;

	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private List<Booking> booking;

	public Customer() {
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public String getVehiclemake() {
		return vehiclemake;
	}

	public void setVehiclemake(String vehiclemake) {
		this.vehiclemake = vehiclemake;
	}

	public String getVehiclelicense() {
		return vehiclelicense;
	}

	public void setVehiclelicense(String vehiclelicense) {
		this.vehiclelicense = vehiclelicense;
	}

	public String getVehicleFuel() {
		return vehicleFuel;
	}

	public void setVehicleFuel(String vehicleFuel) {
		this.vehicleFuel = vehicleFuel;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Boolean getAccess() {
		return access;
	}

	public void setAccess(Boolean access) {
		this.access = access;
	}

	public String getCustomerlogin() {
		return customerlogin;
	}

	public void setCustomerlogin(String customerlogin) {
		this.customerlogin = customerlogin;
	}

	public String getCustomerpassword() {
		return customerpassword;
	}

	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
}

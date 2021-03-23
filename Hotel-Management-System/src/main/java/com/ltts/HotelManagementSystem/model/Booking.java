package com.ltts.HotelManagementSystem.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking implements Serializable{
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	@Id
	private String bookingid;
	private String roomnumber;
	private Date bookingdate;
	private String status;
	private Date checkoutdate;
	private String paymenttype;
	private String phonenumber;
	private String menuid;
	private Date menudate;
	
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getphonenumber() {
		return phonenumber;
	}
	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public Date getMenudate() {
		return menudate;
	}
	public void setMenudate(Date menudate) {
		this.menudate = menudate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Booking(String bookingid, String roomnumber, Date bookingdate, String status, Date checkoutdate,
			String paymenttype, String phonenumber, String menuid, Date menudate) {
		super();
		this.bookingid = bookingid;
		this.roomnumber = roomnumber;
		this.bookingdate = bookingdate;
		this.status = status;
		this.checkoutdate = checkoutdate;
		this.paymenttype = paymenttype;
		this.phonenumber = phonenumber;
		this.menuid = menuid;
		this.menudate = menudate;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", roomnumber=" + roomnumber + ", bookingdate=" + bookingdate
				+ ", status=" + status + ", checkoutdate=" + checkoutdate + ", paymenttype=" + paymenttype + ", phonenumber="
				+ phonenumber + ", menuid=" + menuid + ", menudate=" + menudate + "]";
	}
	
	
}
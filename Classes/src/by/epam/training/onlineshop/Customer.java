package by.epam.training.onlineshop;

import java.util.Date;

public class Customer {

	private String name;
	private String deliveryType;
	private Date deliveryDate;
	private String paymentType;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDeliveryType() {
		return deliveryType;
	}
	
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}

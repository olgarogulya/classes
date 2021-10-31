package by.epam.training.fooddelivery;

import java.util.Date;

public class Customer {

	private String name;
	private String addressDelivery;
	private Date deliveryStartTime;
	private Date deliveryEndTime;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddressDelivery() {
		return addressDelivery;
	}
	
	public void setAddressDelivery(String addressDelivery) {
		this.addressDelivery = addressDelivery;
	}
	
	public Date getDeliveryStartTime() {
		return deliveryStartTime;
	}
	
	public void setDeliveryStartTime(Date deliveryStartTime) {
		this.deliveryStartTime = deliveryStartTime;
	}
	
	public Date getDeliveryEndTime() {
		return deliveryEndTime;
	}
	
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

}

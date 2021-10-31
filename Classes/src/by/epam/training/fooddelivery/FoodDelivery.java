package by.epam.training.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class FoodDelivery {

	private int dayOfMonth;
	private boolean isDelivered;
	private String courier;
	private List<Food> dishes = new ArrayList<Food>();
	private List< Customer > customer = new ArrayList< Customer >();
	
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	public boolean isDelivered() {
		return isDelivered;
	}
	
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	
	public String getCourier() {
		return courier;
	}
	
	public void setCourier(String courier) {
		this.courier = courier;
	}
	
	public List<Food> getDishes() {
		return dishes;
	}
	
	public void setDishes(List<Food> dishes) {
		this.dishes = dishes;
	}
	
	public List<Customer> getCustomer() {
		return customer;
	}
	
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	
}

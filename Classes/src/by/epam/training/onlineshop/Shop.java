package by.epam.training.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	private int dayOfMonth;
	private boolean isBooked;
	private List<Product> products = new ArrayList<Product>();
	private List<Customer> customer = new ArrayList<Customer>();
	
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	public boolean isBooked() {
		return isBooked;
	}
	
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public List<Customer> getCustomer() {
		return customer;
	}
	
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
}

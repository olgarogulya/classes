package by.epam.training.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private int dayOfMonth;
	private boolean isBooked;
	private List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();
	private List<Guest> guests = new ArrayList<Guest>();
	
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
	
	public List<HotelRoom> getHotelRooms() {
		return hotelRooms;
	}
	
	public void setHotelRooms(List<HotelRoom> hotelRooms) {
		this.hotelRooms = hotelRooms;
	}
	
	public List<Guest> getGuests() {
		return guests;
	}
	
	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}
	
}

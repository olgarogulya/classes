package by.epam.training.hotel;

import java.util.Date;

public class HotelRoom {
	private int roomNumber = 0;
	private Date startDate;
	private Date endDate;
	private int price;
	private boolean cleaningDone;
	
	public HotelRoom(int roomNumber, Date startDate, Date endDate, int price, boolean cleaningDone) {
		this.roomNumber = roomNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.cleaningDone = cleaningDone;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isCleaningDone() {
		return cleaningDone;
	}

	public void setCleaningDone(boolean cleaningDone) {
		this.cleaningDone = cleaningDone;
	}
	
	
}

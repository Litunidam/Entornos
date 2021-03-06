package com.gmq.ejercicioMonth;

public enum Month {

	JANUARY("January", 31),
	FEBRUARY("February", 28),
	MARCH("March", 31), 
	APRIL("April", 30), 
	MAY("May", 31),
	JUNE("June", 30),
	JULY("July", 31), 
	AUGUST("August", 31), 
	SEPTEMBER("September", 30), 
	OCTOBER("October", 31),
	NOVEMBER("November", 30),
	DECEMBER("December", 31);

	private final String month;
	private final int day;

	Month(String month, int days) {
		this.month = month;
		this.day = days;
	}

	public String getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}
}


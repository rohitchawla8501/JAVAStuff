package com.seed1;

public class Mydate implements Cloneable {
	private int day,month,year;

	public Mydate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
    public Object clone()throws CloneNotSupportedException
    {
    	return super.clone();
    }

}

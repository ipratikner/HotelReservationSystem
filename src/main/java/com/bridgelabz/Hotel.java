package com.bridgelabz;
/*
using encapsulation class to keep data private

 */
public class Hotel {

    private String hotelName;
    private Integer regularWeekdayRate;
    private Integer regularWeekendRate;

    public Hotel(String hotelName, Integer regularWeekdayRate, Integer regularWeekendRate  ) {
        this.hotelName = hotelName;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
    }

    public static boolean isEmpty() {
        return false;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getRegularWeekdayRate() {
        return regularWeekdayRate;
    }

    public void setRegularWeekdayRate(Integer regularWeekdayRate) {
        this.regularWeekdayRate = regularWeekdayRate;
    }
    public Integer getRegularWeekendRate() {
        return regularWeekendRate;
    }

    public void setRegularWeekendRate(Integer regularWeekendRate) {
        this.regularWeekendRate = regularWeekendRate;
    }
}


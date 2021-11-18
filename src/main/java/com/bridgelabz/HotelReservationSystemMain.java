package com.bridgelabz;
import java.util.ArrayList;
/*
Ability to add hotel in hotel reservation system
with name and rates for regular customer
 */
public class HotelReservationSystemMain {
    static ArrayList<Hotel> hotelList = new ArrayList<>(); //declaring arrylist to store hotel and rates

    public static void main(String[] args) {
        System.out.println("*****Welcome to Hotel Reservation System*****");

        /*
        ctrating object of main class and hotel class
         */

        HotelReservationSystemMain hotelReservationSystem = new HotelReservationSystemMain();

        Hotel hotel1 = new Hotel("LakeWood",110, 90);
        hotelReservationSystem.addHotel(hotel1);
        Hotel hotel2 = new Hotel("BridgeWood",160, 60);
        hotelReservationSystem.addHotel(hotel2);
        Hotel hotel3 = new Hotel("RidgeWood",220, 150);
        hotelReservationSystem.addHotel(hotel3);
    }

    public boolean addHotel(Hotel hotel) {

        return hotelList.add(hotel);
    }

}


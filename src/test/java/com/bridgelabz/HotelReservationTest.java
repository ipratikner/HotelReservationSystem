package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    //information of hotel name and customer rate when Hotel get added
    public void givenHotelname_And_CustomerRate_ShouldAddHotel(){

        HotelReservationSystemMain hotelReservationSystem = new HotelReservationSystemMain();
        Hotel hotel1 = new Hotel("LakeWood",110, 90);

        hotelReservationSystem.addHotel(hotel1);
        Hotel hotel2 = new Hotel("BridgeWood",160, 60);

        hotelReservationSystem.addHotel(hotel2);
        Hotel hotel3 = new Hotel("RidgeWood",220, 150);
        hotelReservationSystem.addHotel(hotel3);

        Assertions.assertFalse(Hotel.isEmpty());
    }
}

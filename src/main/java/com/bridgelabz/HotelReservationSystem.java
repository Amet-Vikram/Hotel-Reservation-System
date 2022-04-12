package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

    ArrayList<Hotels> hotelListings = new ArrayList<>();

    void addHotel(){
        Scanner scan = new Scanner(System.in);
        Hotels newHotel = new Hotels();
        System.out.println("Enter Name of the hotel: ");
        String name = scan.next();
        newHotel.setName(name);
        System.out.println("Enter rates for regular customer on Weekdays: ");
        Integer wdRegular = scan.nextInt();
        newHotel.setWD_REGULAR(wdRegular);
        System.out.println("Enter rates for regular customer on Weekends: ");
        Integer weRegular = scan.nextInt();
        newHotel.setWE_REGULAR(weRegular);
        hotelListings.add(newHotel);
    }

}

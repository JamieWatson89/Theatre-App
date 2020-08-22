package com.jamiewatson._final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre monteCasino = new Theatre("Monte Casino",10,15);
//	    if(monteCasino.reserveSeat("D02")){
//            System.out.println("Please pay for D02");
//        }else{
//            System.out.println("Seat is already reserved");
//        }
//
//	    List<Theatre.Seat> reversedSeats = new ArrayList<>(monteCasino.getSeats());
//        Collections.reverse(reversedSeats);
//        printList(reversedSeats);

        List<Theatre.Seat> seats = new ArrayList<>(monteCasino.getSeats());
        seats.add(monteCasino.new Seat("B00" , 13.00));
        seats.add(monteCasino.new Seat("A00" , 13.00));
        Collections.sort(seats,Theatre.PRICE_ORDER);
        printList(seats);



    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list ){
            System.out.println(seat.getSeatNumber() + " R" + seat.getPrice() + " ");
        }

    }
}

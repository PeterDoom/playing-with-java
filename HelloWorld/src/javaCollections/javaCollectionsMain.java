package javaCollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class javaCollectionsMain {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Jix", 12, 20);
        theatre.reserveSeat("A15");
        theatre.reserveSeat("A15");
        theatre.reserveSeat("A235");
        List<Theatre.Seat> seatCopy = theatre.getSeats();
        Collections.shuffle(theatre.getSeats());
        printList(seatCopy);
        sortList(seatCopy);
        printList(seatCopy);
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j))> 0) {
                    Collections.swap(list, i, j);
                }
            }

        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice() + " ");
        }
        System.out.println();
        System.out.println("======================================================================");
    }
}

package javaCollections;

import java.util.*;

public class Theatre {
    public final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public List<Seat> getSeats() {
        return seats;
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestSeat,null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        }else {
            System.out.println("There is no seat or seat number");
            return false;
        }
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Already Reserved");
                return false;
            }
        }
        public boolean cancel () {
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat: " + seatNumber + " is canceled");
                return true;
            }
            else {
                return false;
            }
        }
    }
}

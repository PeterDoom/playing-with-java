package javaCollections;


import java.util.Collections;
import java.util.List;

public class javaCollectionsMain {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Jix", 50, 20);
        theatre.reserveSeat("A15");
        theatre.reserveSeat("A15");
        theatre.reserveSeat("A235");
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
}

package javaCollections.sets;

import java.util.HashSet;
import java.util.Set;

public class SetsMain2 {
    public static void main(String[] args) {
        Set<Integer> sqaures = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            sqaures.add(i * i)
        }
    }
}

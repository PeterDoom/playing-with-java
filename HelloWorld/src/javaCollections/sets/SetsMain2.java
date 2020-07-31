package javaCollections.sets;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsMain2 {
    public static void main(String[] args) {
        Set<Integer> sqaures = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            sqaures.add(i * i);
            cubes.add(i * i * i);
        }

        //System.out.println("There are " + sqaures.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(sqaures);
        union.addAll(cubes);
        //System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(sqaures);
        intersection.retainAll(cubes);
        //System.out.println("Intersection contains " + intersection.size() + " elements");

        for(int i : intersection){
            //System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of" + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String [] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }
    }
}

package prim;
import java.util.Scanner;

public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("I'm here ");
        long getResult = toMilesPerHour(75.114);
        System.out.println("Miles: " + getResult);
        killMe();
        forLoopinator(5);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double coefficient = 1.609;
        double result = kilometersPerHour / coefficient;
        return (long) Math.round(result);
    }

    public static void printConversion(double initialValue) {
        long getValue = toMilesPerHour(initialValue);
        String message = initialValue + " km/h = " + getValue + " mi/h";

        if (initialValue < 0) {
            message = "Invalid Value";
        } else if (getValue < 0) {
            message = "-1";
        }

        System.out.println(message);
    }

    public static void forLoopinator(int iterNum) {
        for (int i = 0; i <iterNum ;i++){
            System.out.println("Print "+ i);
        }
    }

    public static void killMe() {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int age = scanner.nextInt();
            System.out.println("Your age is: " + age);
        }
        scanner.nextLine();
        System.out.println("Write name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        scanner.close();
    }
}


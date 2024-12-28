package Scalar;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Prime_ArList {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // The number is prime
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(12, 3, 6, 9, 7, 13));

        // Create a new list to store non-prime numbers
        ArrayList<Integer> nonPrimes = new ArrayList<>();

        // Loop through the original list
        for (int i = 0; i < num.size(); i++) {
            if (!isPrime(num.get(i))) {
                nonPrimes.add(num.get(i)); // Add non-prime numbers to the new list
            }
        }

        // Update the original list
        num.clear(); // Clear the original list
        num.addAll(nonPrimes); // Add all non-prime numbers back

        System.out.println(num); // Output the modified list
    }
}

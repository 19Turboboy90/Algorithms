package primeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = console.nextInt();
        System.out.println("Prime numbers up to " + num + ": " + Arrays.toString(getPrimeNumbers(num).toArray()) + "\n"
                + "size: " + getPrimeNumbers(num).size());
    }

    private static List<Integer> getPrimeNumbers(int max) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

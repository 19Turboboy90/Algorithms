package primeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = console.nextInt();
        System.out.println("Prime numbers up to " + num + ": " + getPrimeNumbers(num) +
                "size: " + getPrimeNumbers(num).size());
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
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

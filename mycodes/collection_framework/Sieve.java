// Uses a  linked list to implement the sieve of
// Eratosthenes algorithm for finding prime numbers

import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given maximum");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int Max = console.nextInt();

        List<Integer> primes = sieve(Max);
        System.out.println("Prime numbers up to " + Max + ":");
        System.out.println(primes);
        console.close();
    }

    // Returns a list of all prime numbers up to a given max
    // using the sieve of Eratosthenes algorithm
    public static List<Integer> sieve(int max) {
        List<Integer> primes = new LinkedList<>();

        // add all numbers from 2 to max to list
        List<Integer> numbers = new LinkedList<>();
        for (int i = 2;i <= max;i++) {
            numbers.add(i);
        }
        double Max = max;
        double Sqrt = Math.sqrt(Max);
        while (!numbers.isEmpty()) {
            // remove a prime number from the frount of the list
            int front = numbers.remove(0);
            primes.add(front);
            if (front > Sqrt) {
                break;
            }
            // remove all multiples of this prime number
            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0) {
                    itr.remove();
                }
            }
        }

        if (!numbers.isEmpty()) {
            while (!numbers.isEmpty()) {
                int front = numbers.remove(0);
                primes.add(front);
            }
        }
        return primes;
    }
}
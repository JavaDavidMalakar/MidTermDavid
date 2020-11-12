// done
package math.problems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        primeMethod();

    }

    private static void primeMethod() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input a number to know if it's a prime or not!!");
        int num = userInput.nextInt();
        System.out.print("You entered " + num + " which is");
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(" a prime number");
        } else {
            System.out.println(" not a prime number");

        }

    }
}

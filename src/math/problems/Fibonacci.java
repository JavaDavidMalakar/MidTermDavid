//done
package math.problems;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        fibonacciSequenceMethod();
    }


    public static void fibonacciSequenceMethod() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many Fibonnaci numbers do you want to see?");
        int n = userInput.nextInt();

        int first = 0;
        int second = 1;
        int fiboSeq;
        System.out.println("Your desired length of Fibonacci sequence is: [ " + n + " ]");
        System.out.print("The series is: " + "\n" + first + " " + "\n" + second + "\n");
        for (int i = 3; i < n; i++) {
            fiboSeq = first + second;
            System.out.println(fiboSeq);
            first = second;
            second = fiboSeq;
        }

    }
}

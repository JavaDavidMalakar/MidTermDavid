package string.problems;
// done
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
         /* String x = "Mami";
        String y = "Imam";*/

        //Scanner object for taking user input
        Scanner userString = new Scanner(System.in);

        //Taking user input and storing into two new variables
        System.out.println("Enter a word of choice");
        String x = userString.next();
        System.out.println("Enter another word of choice");
        String y = userString.next();


        System.out.println("The words are " + isAnagram(x, y) + " anagrams.");
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();

        char[] string4 = word1.toCharArray();
        Arrays.sort(string4);

        char[] string5 = word2.toCharArray();
        Arrays.sort(string5);
        return Arrays.equals(string4, string5);
    }
}



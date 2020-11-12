package string.problems;
// done
public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String str3 = "ABBA";
        if (isPalindrome(str3)) {
            System.out.println(str3+ " is Palindrome");
        }
        else {
            System.out.println(str3+" is not Palindrome");
        }
    }


    public static boolean isPalindrome(String str1) {

        String word = str1;
        StringBuilder str2 = new StringBuilder();
        int l1 = word.length();

        for (int i = 0; i < l1; i++) {
            str2.append(word.charAt(l1 - 1 - i));
        }
        String palFinder = new String(str2);

        if (word.matches(palFinder))
            return true;
        else return false;
    }
}

package string.problems;
// done
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;
        // Converting the sentence into lower case
        st = st.toLowerCase();

        //Splitting the string into words using built-in function
        String[] words = st.split(" ");

        //Using for nested loops to determine the
        System.out.println("The duplicate words are: ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
        //To find average length
        String[] average = st.split(" ");

        int count2 = 0;
        int sum = 0;
        int currentWordLength;
        String tempString;
        for (int i = 0; i < average.length; i++) {
            average[i] = average[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
            tempString = average[i];
            currentWordLength = tempString.length();
            sum += currentWordLength;
            count2++;
        }
        double averageWordLength = sum / count2;
        System.out.println("Average length of word is: " + averageWordLength);
    }

}

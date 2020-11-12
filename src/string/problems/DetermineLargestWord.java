package string.problems;
//done
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static String largestWord(String wordInput){

        Map<Integer, String> theLargestWord = findTheLargestWord(wordInput);
        int largest = 0;
        String largeValue = "";
        for(Map.Entry<Integer, String> lengthValue : theLargestWord.entrySet()){
            if(largest< lengthValue.getKey()) {
                largest = lengthValue.getKey();
                largeValue = lengthValue.getValue();
            }
        }
        return largeValue;
    }

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        System.out.println("Length of the longest word is: "+largestWord(s).length());
        System.out.println("The longest word is: "+largestWord(s));

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] split = wordGiven.split(" ");
        for(int i=0;i<split.length;i++){
            map.put(split[i].length(),split[i]);
        }
        return map;
    }
}

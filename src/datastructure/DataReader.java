package datastructure;
// done but system could't find the file"src\data\self-driving-car.txt"
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        // String filepath = ".../MidTerm_WeekdaysEvening_Selenium_NY_Summer2020/DataTest/Sample.txt";
        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

        try {
            fileReader = new FileReader(textFile);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: File not found");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Exception: File closed.");
            }
        }
        String data = "";
        String store = "";
        try {
            bufferedReader = new BufferedReader(fileReader);
            while ((data = bufferedReader.readLine()) != null) {
                store += data;
                System.out.println(store);
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("We couldn't find the file");
        } finally {
            if (fileReader != null) {
                fileReader = null;
            }
            if (bufferedReader != null) {
                bufferedReader = null;
            }
        }
        String[] storeArray = store.split(" ");
        List<String> storeList = new LinkedList<String>();
        Stack<String> storeStack = new Stack<String>();

        for (String element : storeArray) {
            storeList.add(element);
            storeStack.push(element);

        }
        System.out.println("\nLinkedList FIFO:");
        Iterator<String> itr = storeList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\nStack FILO:");

        while (!storeStack.isEmpty()) {
            System.out.print(storeStack.pop() + " ");

        }
    }
}

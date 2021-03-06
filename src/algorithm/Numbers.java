// done
package algorithm;
import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;


public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[10];//To minimize the CPU processing time we took an integer array of 10 indices
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("employee_record", "selection_sort", "SortingNumbers");
        printValue(numbers);
        int n = num.length;
        randomize(num, n);

        //Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
        List<String> numbers2 = connectToSqlDB.readDataBase("employee_record", "insertion_sort", "SortingNumbers");
        printValue(numbers2);
        randomize (num, n);

        //Bubble Sort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
        List<String> numbers3 = connectToSqlDB.readDataBase("employee_record", "bubble_sort", "SortingNumbers");
        printValue(numbers3);
        randomize (num, n);

        //Bucket Sort
        int max_value = algo.max_value(num);
        algo.bucketSort(num,max_value);
        num=algo.bucketSort(num,max_value);
        long bucketSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
        List<String> numbers4 = connectToSqlDB.readDataBase("employee_record", "bucket_sort", "SortingNumbers");
        printValue(numbers4);
        randomize (num, n);

        //Heap Sort
        algo.heapSort(num);
        long heapSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
        List<String> numbers5 = connectToSqlDB.readDataBase("employee_record", "heap_sort", "SortingNumbers");
        printValue(numbers5);
        randomize (num, n);

        //Merge Sort
        algo.mergeSort(num,0,num.length-1);
        long mergeSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
        List<String> numbers6 = connectToSqlDB.readDataBase("employee_record", "merge_sort", "SortingNumbers");
        printValue(numbers6);
        randomize (num, n);

        //Quick Sort
        algo.quickSort(num,0,num.length-1);
        long quickSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
        List<String> numbers7 = connectToSqlDB.readDataBase("employee_record", "quick_sort", "SortingNumbers");
        printValue(numbers7);
        randomize (num, n);

        //Shell Sort
        algo.shellSort(num);
        long shellSortExecutionTime= algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
        List<String> numbers8 = connectToSqlDB.readDataBase("employee_record", "shell_sort", "SortingNumbers");
        printValue(numbers8);

        System.out.println("For given data set Selection Sort is the worst, Quick Sort is better");





    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}

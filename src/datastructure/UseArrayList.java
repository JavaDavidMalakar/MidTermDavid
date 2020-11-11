package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseArrayList {

    public static void main(String[] args) throws Exception {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        int limit = 10;
        ArrayList<Integer> listOfMembers=new ArrayList<Integer>();

        //Adding elements by add() method
        Random team2 = new Random();
        for(int i=0; i<limit; i++){
            listOfMembers.add(team2.nextInt(100));
        }
        for(int j=0; j<listOfMembers.size(); j++){
            //Peeking elements by get() method, there is no peek() method for ArrayList
            System.out.print(listOfMembers.get(j)+" , ");
        }
        System.out.println();

        System.out.println("ArrayList size before remove :"+listOfMembers.size());
        //Removing elements by remove() method
        listOfMembers.remove(0);
        listOfMembers.remove(1);
        System.out.println("ArrayList size after remove :"+listOfMembers.size());

        System.out.println("Re-retrieving elements from ArrayList: " + listOfMembers);

        //Sorting ArrayList
        Collections.sort(listOfMembers);
        System.out.println("Sorting ArrayList :"+listOfMembers);

        //Retrieve with for loop
        System.out.println("Retrieve with for loop");
        for (int i = 0; i < listOfMembers.size(); i++) {
            System.out.print(listOfMembers.get(i)+" , ");
        }
        System.out.println();

        //Retrieve with while loop and iterator
        System.out.println("Retrieve with while loop and iterator");
        Iterator it = listOfMembers.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" , ");
        }
        System.out.println();

        //Retrieve with For each loop
        System.out.println("Retrieve with For each loop");
        for(Integer str:listOfMembers)
            System.out.print(str+" , ");
        System.out.println();

        ArrayList members= new ArrayList();
        members=listOfMembers;

        //Connect to MySql Database
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        //Create table, Insert and Read data from database
        connectToSqlDB.insertDataFromArrayListToSqlTable(members,"tbl_arrayList", "column_lowestNumber");
        List<String> numbers = connectToSqlDB.readDataBase("employee_record", "tbl_arrayList", "column_lowestNumber");
        for(String st:numbers) System.out.println(st);

    }

}

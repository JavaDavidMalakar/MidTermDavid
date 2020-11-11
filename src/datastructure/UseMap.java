package datastructure;
import java.util.*;
public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulip");

        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Pink");

        List<String> Birds = new ArrayList<>();
        Birds.add("Moyna");
        Birds.add("Crow");

        Map<String, List<String>> list = new HashMap<String, List<String>>();
        list.put("Plant",flowers);
        list.put("Shade", color);
        list.put("Animal",Birds);
        System.out.println(list);
        System.out.println(" ");
        System.out.println("Getting values by using for each loop.....");
        for (Map.Entry<String, List<String>> st : list.entrySet()){
            System.out.println(st.getKey()+ " --------> " +st.getValue());
        }
        System.out.println(" ");
        System.out.println("Getting values by  using iterator.....");
        Set set = list.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}

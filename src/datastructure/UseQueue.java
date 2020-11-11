package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> queue = new LinkedList<String>();

        //Adding elements in the queue:
        queue.add("New York");
        queue.add("Connecticut");
        queue.add("Pennsylvania");
        queue.add("New Jersey");
        queue.add("Maryland");

        System.out.println("Elements in Queue:" + queue);

        //Implementing remove()
        System.out.println("Removed element: " + queue.remove());


        //Getting new top
        System.out.println("New Top: " + queue.element());

        //Implementing poll()
        System.out.println("poll(): " + queue.poll());

        //Implementing peek()
        System.out.println("peek(): " + queue.peek());

        //Displaying queue with the changes
        System.out.println("Elements in Queue:" + queue);
    }

}

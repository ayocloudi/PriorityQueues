import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        
        //Priority Queue = A FIFO data struture that serves elements
        //                with the highest priorities first
        //                before elemets with lower proficiency
        
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        
        //A while loop to print all elements in the queue and also remove them 
        while(!queue.isEmpty()) {
        //Removes the elements from the queue after they are added in
        System.out.println(queue.poll()); 
        }
    }
}

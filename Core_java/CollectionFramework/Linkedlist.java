package CollectionFramework;
import java.util.*;
public class Linkedlist {
    public static void main(String a[])
    {
        LinkedList l1=new LinkedList();
        // linked List work on doubly linked list in data structure 
        //it contains some extra methods with all collection interface methods and--
        // -- also with all list interface methods
        l1.addFirst(30);
        l1.addLast(34);
        l1.addFirst(45);
        l1.addLast(45);
        l1.removeFirst();
        l1.removeLast();
        l1.getFirst();
        l1.getLast();
        l1.get(1);
        l1.add(34);
        System.out.println(l1);
    }
}

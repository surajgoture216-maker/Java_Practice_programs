package CollectionFramework;
import java.util.*;
public class dequeuejava {
    public static void main(String a[])
    {
       Deque<Integer> d=new LinkedList<>();
       d.offerFirst(49);
       d.offerLast(48);
       System.out.println(d.getFirst());
       System.out.println(d.getLast());
       System.out.println(d.pollFirst());
       System.out.println(d.peekFirst());
       System.out.println(d.element());
       System.out.println(d.removeFirst());

    }
}
package CollectionFramework;
import java.util.*;
public class Listiteratorinjava {
    public static void main(String a[])
    {
        LinkedList l1=new LinkedList();
        l1.addFirst(36);
        l1.addFirst(35);
        l1.addFirst(34);
        l1.addFirst(33);
        l1.addFirst(32);
        l1.addFirst(34);
        ///list iterator is a child interface of the iterator interface 
        /// it can move forward and also backward direction
        /// it contains some more methods to bechward iteration
        ListIterator ltr=l1.listIterator();
        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
            System.out.println(ltr.nextIndex());
            // this add will ad value after the current element
            ltr.add(35);
            ltr.set(45);
        }
        while(ltr.hasPrevious())
        {
            System.out.println(ltr.previous());
            System.out.println(ltr.previousIndex());
            ltr.remove();
        }


    }
}

import java.util.*;
public class listiterator {
    public static void main(String a[])
    {
        ArrayList arr=new ArrayList<>();
        arr.addAll(Arrays.asList(2,3,4,5,3,2));
        ListIterator itr=arr.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            System.out.println(itr.nextIndex());
            itr.set(32);
            itr.remove();
            itr.add(43);
        }
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
            System.out.println(itr.previousIndex());
        }
    }
}

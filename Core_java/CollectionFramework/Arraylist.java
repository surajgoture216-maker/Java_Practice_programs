package CollectionFramework;
import java.util.*;
public class Arraylist {
    public static void main(String a[])
    {
        ArrayList a1=new ArrayList(23);
        ArrayList<String> a2=new ArrayList<>(a1);
        for(int i=0;i<5;i++)
        {
          a1.add(i);
        }
        // here you can able to use all methods present in collection interface and also 
        // all methods present oin the list framework
         // for iteration propose we use iterator method 
        LinkedList l1=new LinkedList(a1);
        System.out.println(l1);

         Iterator itr=a1.iterator();
         while(itr.hasNext())
         {
            System.out.println(itr.next());
            itr.remove();
         }
         System.out.println(a1);
    }
}

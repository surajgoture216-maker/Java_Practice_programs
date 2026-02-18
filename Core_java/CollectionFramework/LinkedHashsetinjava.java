package CollectionFramework;
import java.util.*;
public class LinkedHashsetinjava {
    public static void main(String a[])
    {   
        ///in this linked hashset all insertion order data will be stored in the ds 
        /// no duplicates are allowed in this
        LinkedHashSet h1=new LinkedHashSet();
        h1.add(34);
        h1.add(37);
        h1.add(30);
        TreeSet h2=new TreeSet(h1);
        System.out.println(h2);
        // in linkedlistset also we dont have any extra methoids so we can able to access methods using 
        //iterator methods only
        Iterator itr=h1.iterator();
        while(itr.hasNext())
          System.out.println(itr.next());
        }
}

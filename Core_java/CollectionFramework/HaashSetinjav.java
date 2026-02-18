package CollectionFramework;
import java.util.*;
public class HaashSetinjav {
    public static void main(String a[])
    {  
        ///first up all the set interface doesnot conatains any own--
        // -- methods it uses all collection interface methodsonly
        /// we can able to create a hash set with 4 diff types
        /// this is with defalut size 
        /// size in 16 and fill ratio or load ratio is .75
        HashSet h1=new HashSet();
        /// this is with initial limite
        HashSet h2=new HashSet(100);
        // this is with initial capacity and initial load ratio
        HashSet h3=new HashSet(100,0.80f);
        // this is with the  same size for other collection and its elements
        HashSet h4=new HashSet(h2);
        h1.add(3498);
//its not conatains get methods also so you have to use iterator to access the elements
     Iterator itr=h1.iterator();
     while(itr.hasNext())
        System.out.println(itr.next());
    // or use contains methods to check its present or not
      System.out.println(h1.contains(3498));
     


    }
}

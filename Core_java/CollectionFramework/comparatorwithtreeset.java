package CollectionFramework;
import java.util.*;
public class comparatorwithtreeset {
    public static void main(String a[])
    {
        TreeSet t=new TreeSet(new mycomparator());
        t.add(10);
        t.add(30);
        t.add(43);
          System.out.println(t);
    }
}
////////////one way/////////////
// class mycomparator implements Comparator
// {
//    public int compare(Object v1,Object v2)
//    {
//      Integer a1=(Integer)v1;
//      Integer a2=(Integer)v2;
//      if(a1<a2)
//         return +10;
//      else if(a1>a2)
//         return -10;
//      else
//         return 0;
//    }
// }
//////////////second way///////////
 class mycomparator implements Comparator
 {
    public int compare(Object v1,Object v2)
    {
      Integer o1=(Integer)v1;
      Integer o2=(Integer)v2;
    // return o1.compareTo(o2);//this is for ascending order
    // return -o1.compareTo(o2);//this is for descending order
    //  return o2.compareTo(o1);//this is also for descending order
      return -o2.compareTo(o1);//this is  for ascending order
    }
 }
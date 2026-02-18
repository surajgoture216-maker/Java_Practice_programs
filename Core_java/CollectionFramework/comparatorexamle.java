package CollectionFramework;
import java.util.*;
public class comparatorexamle {
    public static void  main(String a[])
    {
        TreeSet s1=new TreeSet(new mycomparator());
        s1.add("dh");
        s1.add(new StringBuffer("gydg"));
        s1.add("dy");
        s1.add("h");
        System.out.println(s1);
    }
}
class mycomparator implements Comparator
{
    public int compare(Object v1,Object v2)
    {
        String s1=v1.toString();
        String s2=v2.toString();
        if(s1.length()>s2.length())
            return 100;
        else if(s1.length()<s2.length())
            return -100;
        else  
            return s1.compareTo(s2);
        
    }
}
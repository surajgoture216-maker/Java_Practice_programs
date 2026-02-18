import java.util.*;
public class Vectoreexample {
    public static void main(String a[])
    {
        Vector<Integer> v1=new Vector<>();
        Collections.addAll(v1,2,1,4,6,3,6,4,0,8,9,0,2,-2);
        Enumeration en=v1.elements();
        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }
        int smallest=Integer.MAX_VALUE;
        int snd=Integer.MAX_VALUE;
        for(int i=0;i<v1.size();i++)
        {
         if(v1.get(i)<smallest)
            smallest=v1.get(i); 
        }
        for(int i=0;i<v1.size();i++)
        {
         if(v1.get(i)<snd && v1.get(i)!=smallest)
            snd=v1.get(i); 
        }
        System.out.println(snd);
    }
}

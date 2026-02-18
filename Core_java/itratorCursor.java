import java.util.*;
public class itratorCursor {
    public static void main(String a[])
    {
    ArrayList arr=new ArrayList();
    for(int i=0;i<5;i++)
        {
           arr.add(i);
        }
    System.out.println(arr);
    Iterator itr=arr.iterator();
    while(itr.hasNext())
    {   
        Integer l=(Integer)itr.next();
        if((l%2==0)?true:false)
            System.out.println(l);
        
        else
            itr.remove();
    }
    System.out.println(arr);
    
    }
}

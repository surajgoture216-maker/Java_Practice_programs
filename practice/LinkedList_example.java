import java.util.*;
public class LinkedList_example {
    public static void main(String a[])
    {
      LinkedList<Integer> l1=new LinkedList<>();
      Collections.addAll(l1,3,5,7,8);
      LinkedList<Integer> l2=new LinkedList<>();
      Collections.addAll(l2,2,4,5,7,90);
      LinkedList<Integer> result=new LinkedList<>();
      int i=0,j=0;
      outer:
      for(;i<l1.size();)
      {
        for(;j<l2.size();)
        {
           if(l1.get(i)>l2.get(j))
             result.addLast(l2.get(j++));
           else
             result.addLast(l1.get(i++));
           continue outer;
        }
      }
      while(i<l1.size())
        result.add(l1.get(i++));
     while(j<l2.size())
        result.add(l2.get(j++));
      System.out.println(result);
    }
}

package CollectionFramework;
import java.util.*;
public class queuecollection {
    public static void main(String a[])
    {
        PriorityQueue q=new PriorityQueue(10,new mycom());
        System.out.println(q.offer(10));
        System.out.println(q.offer(11));
        System.out.println(q.offer(12));
        System.out.println(q.offer(13));
        System.out.println(q.offer(14));
        System.out.println(q.offer(15));
        System.out.println(q.offer(16));
        System.out.println(q.offer(17));
        System.out.println(q.offer(18));
        System.out.println(q.offer(19));
        System.out.println(q.offer(34));
        System.out.println(q.add(298));
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.size());
        System.out.println("*****************");
        Iterator itr=q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
class mycom implements Comparator
{
  public int compare(Object v1,Object v2)
  {
    if((Integer)v1<(Integer)v2)
        return +100;
    else if((Integer)v1>(Integer)v2)
        return -100;
    else
        return 0;
  }
}

import java.util.*;
public class dequeex {
    public static void main(String a[])
    {
        Deque<Integer> q=new LinkedList<>();
        Queue<Integer> dq=new LinkedList<>();
        Collections.addAll(dq,3,4,2,5,6,7);
        System.out.println(dq);
        Iterator itr=dq.iterator();
        while(itr.hasNext())
        {
         System.out.println(itr.next());
        }
        int n=4;
        int size=dq.size();
        for(int i=0;i<size;i++)
        {
            while(i<n)
            {
                q.addFirst(dq.poll());
                i++;
            }
            if(i>=n)
                q.addLast(dq.poll());
        }
        System.out.println(q);
    }
}

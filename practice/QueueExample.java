import java.util.*;
public class QueueExample {
    public static void main(String a[])
    {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> qq=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.addAll(Arrays.asList(3,5,6,7,8,9));
        System.out.println(q);
        int n=3;
        int size=q.size();
        for(int i=0;i<size;i++)
        {
          while(i<=n-1)
          {
           st.push(q.poll());
           i++;
          }
          while(!st.isEmpty())
            qq.offer(st.pop());
          qq.offer(q.poll());
        }
        System.out.println(qq);
    }
}

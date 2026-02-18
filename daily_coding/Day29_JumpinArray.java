/*Given an array of integers, find the minimum jumps to reach end (jump length = 
array value). 
Example: Input: [2,3,1,1,4] → Output: 2 (2 →3 →end) */
package daily_coding;
import java.util.*;
public class Day29_JumpinArray {
    public static void main(String a[])
    {
        int arr[]={1,2,3,4,5,6,7,5,8};
        int steps=1,max=0,index=0;
        int locValue=0;
        ArrayList<Integer> stp=new ArrayList<>(5);
        for(int i=0;i<arr.length;)
        {   
           locValue=arr[i];
           stp.add(arr[i]);
           max=0;
           for(int j=i;j<i+locValue&&j<arr.length;j++)
           {
            if(arr[j]>max)
            {
                max=arr[j];
                index=j;
            }
           }
           i=index;
           steps++;

        }
        System.out.println(steps);
        System.out.println(stp.toString());
    }
}

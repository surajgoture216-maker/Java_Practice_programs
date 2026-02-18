/*Given a sorted array and a target value, find the index if the target is found. 
Otherwise, return the index where it would be inserted in order. 
Example: Input: [1,3,5,6], target=5 → Output: 2; target=2 → Output: 1 */
package daily_coding;
import java.util.*;
public class Day28_BinarySearch{
    public static void main(String a[])
    {
        int arr[]={1,2,3,4,6,45,88};
        int target=56;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
              System.out.println("value"+arr[i]+"index"+i);
              break;
            }
            if(i==arr.length-1)
            {
              System.out.println("add at the index"+arr.length);
              break;
            }
            if(arr[i]<target && arr[i+1]>target)
            {
             System.out.println("index  "+(i+1)+"\t in between "+arr[i]+"  and  "+arr[i+1]);
             break;
            }}}}
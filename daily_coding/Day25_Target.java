/*Given an array and a number k, find k smallest elements. 
Example: Input: [7,10,4,3,20,15], k=3 → Output: [3,4,7]*/
package daily_coding;
import java.util.*;
public class Day25_Target {
    public static void main(String a[])
    {
        int arr[]={6,5,3,4,2,1};
        int k=3;
        Arrays.sort(arr);
        for(int i=0;i<k;i++)
        System.out.println(arr[i]);
        
    }
}

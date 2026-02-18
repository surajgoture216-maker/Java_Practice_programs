/*Given two arrays, find the intersection their elements (including duplicates). 
Example: Input: [4,9,5], [9,4,9,8,4] → Output: [4,9] (or [9,4])*/
package daily_coding;
import java.util.*;
public class Day27_intersectofArrray {
    public static void main(String a[])
    {
        int arr[]={1,2,3,4};
        int arr1[]={2,5,3,7};
        ArrayList<Integer> intersect=new ArrayList<>();
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==arr1[i])
                {
                  intersect.add(arr[j]);
                  k++;
                }
            }
        }
        System.out.println(intersect.toString());
    }
}

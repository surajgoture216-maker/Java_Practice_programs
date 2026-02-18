/*26. Given an array, find three numbers whose sum is closest to the target. 
Example: Input: [-1,2,1,-4], target=1 → Output: 2 (because -1+2+1=2) */
package daily_coding;
import java.util.*;
public class Day26_NearestSum {
    public static void main(String a[])
    {
    int arr[]={-1,2,1,-4,7};
    int nearest=Integer.MAX_VALUE;
    int locSum,forMinus,n=5,t=0,u=0,v=0;
    outer:
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
          for(int k=j+1;k<arr.length;k++)
          {
            locSum=arr[i]+arr[j]+arr[k];
            if(locSum==n)
               {
                t=i;u=j;v=k;
                nearest=locSum;
                 break outer;
                }
            forMinus=(locSum-n<0)?Math.abs(locSum-n):locSum-n;
            if(forMinus<nearest-n){
               nearest=locSum;
               t=i;u=j;v=k;
          }}}}
            System.out.println(nearest);
            System.out.println("values="+arr[t]+","+arr[u]+","+arr[v]);
    }}

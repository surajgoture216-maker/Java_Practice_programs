//24. Given an array of integers, find number of pairs with difference equal to k. 
//Example: Input: [1,5,3,4,2], k=2 → Output: 3 (pairs: (1,3),(3,5),(2,4))
package daily_coding;

public class day24_Ksum {
    public static void main(String a[])
    {
 int arr[]={0,1,2,3,4,5,6,7,8,9};
 int k=5;
 System.out.println("pairs=");
     for(int i=0;i<arr.length;i++)
     {
        for(int j=i+1;j<arr.length;j++)
        {
           if(arr[i]+arr[j]==k)
           {
            System.out.println("("+arr[i]+","+arr[j]+")");
           }
        }
     }
    }
}

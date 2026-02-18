package DSA.Sorting;
import java.util.*;
class sorting
{
    void forAssending(int []arr,int n)
    {
      for(int i=1;i<n;i++)
      {
         int current=arr[i];
         int j=i-1;
         while(j>=0 && arr[j]>current)
         {
            arr[j+1]=arr[j];
            j--;
         }
         arr[j+1]=current;
      }
          System.out.println(Arrays.toString(arr));
    }
    void forDecending(int []arr,int n)
    {
       for(int i=0;i<n;i++)
       {
        int current =arr[i];
        int j=i-1;
        while(j>=0 &&arr[j]<current)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
       }
       System.out.println(Arrays.toString(arr));
       System.out.println("this is only to check that gi thub is checking my activity or not");
    }
}
public class Insertion_sort {
    public static void main(String a[])
    {
        int arr[]={0,3,4,2,1,7};
        int n=arr.length;
        sorting obj=new sorting();
        obj.forAssending(arr,n);
        obj.forDecending(arr,n);
    }
}

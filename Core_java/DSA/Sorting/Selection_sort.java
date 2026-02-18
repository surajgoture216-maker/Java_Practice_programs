package DSA.Sorting;
import java.util.*;
class sorting
{
    void forAssending(int arr[],int n)
    {
      for(int i=0;i<n;i++)
      {
        int smallest=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[smallest]>arr[j])
                smallest=j;
        }
        swap(arr,i,smallest);
      }
      System.out.println(Arrays.toString(arr));
    }
    void forDecending(int arr[],int n)
    {
      for(int i=0;i<n;i++)
      {
        int smallest=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[smallest]<arr[j])
                smallest=j;
        }
        swap(arr,i,smallest);
      }
      System.out.println(Arrays.toString(arr));
    }
    void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
public class Selection_sort {
    public static void main(String a[])
    {
        int arr[]={5,7,1,4,6,8};
        int n=arr.length;
        sorting obj=new sorting();
        obj.forAssending(arr,n);
        obj.forDecending(arr,n);
    }
}

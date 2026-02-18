package DSA.Sorting;
import java.util.*;
class forSort
{
    void sortingForAssending(int arr[],int n)
    {
      for(int i=0;i<n-1;i++)
      {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
              swap(arr,j,j+1);
        }
      }
      System.out.println("Assending Sorted array is:"+Arrays.toString(arr));
    }
    void sortingForDecending(int arr[],int n)
    {
      for(int i=0;i<n-1;i++)
      {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]<arr[j+1])
              swap(arr,j,j+1);
        }
      }
     System.out.println("Desending Sorted array is:"+Arrays.toString(arr));
    }
    void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
public class Bubble_sort {
    public static void main(String a[])
    {
        int arr[]={3,2,4,1,3,5};
        int n=arr.length;
        forSort obj=new forSort();
        obj.sortingForAssending(arr,n);
        obj.sortingForDecending(arr,n);
    }
}

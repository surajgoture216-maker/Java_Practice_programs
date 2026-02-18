import java.util.*;
class sorting
{
    void sort(int arr[],int n)
    {
         for(int i=0;i<n;i++)
         {

            for(int j=i+1;j>=0;j--)
            {
             if(arr[i]>arr[j])
             {
                swap(arr,i,j);
             }
            }
         }
    }
    void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
public class selectionsort {
    public static void main(String[] args) {
        sorting obj=new sorting();
        int arr[]={23,5,3,6,4,6,2};
        int n=arr.length;
        obj.sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}

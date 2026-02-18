import java.util.*;
class sorting
{
    void sort(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]>arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }
    void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[i]=temp;
    }
}
public class Bubble_sort
{
    public static void main(String[] args) {
        int arr[]={3,2,5,7,4,6,2};
        int n=arr.length;
        sorting obj=new sorting();
        obj.sort(arr, n);
        System.out.println("hi");
        System.out.println(Arrays.toString(arr));

    }
}
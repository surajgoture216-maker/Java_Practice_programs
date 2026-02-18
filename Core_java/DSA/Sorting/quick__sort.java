package DSA.Sorting;
import java.util.*;
public class quick__sort{
     public static void main(String[] args) {
        int arr[]={2,5,3,4,1,7};
        quick__sort obj=new quick__sort();
        obj.merge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
     }
    void merge(int arr[],int start,int end)
    {
        if(start<end)
        {
            int pivote=partition(arr,start,end);
            merge(arr, start, pivote-1);
            merge(arr, pivote+1, end);
        }
    }
    int partition(int arr[],int start,int end)
    {   
        int idx=start-1;
        int pivote=arr[end];
        for(int j=start;j<end;j++)
        {
            if(arr[j]>pivote)
            {
                idx++;
                swap(arr,j,idx);
            }
        }
        idx++;
        swap(arr,idx,end);
        return idx;
    }
    void swap(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}


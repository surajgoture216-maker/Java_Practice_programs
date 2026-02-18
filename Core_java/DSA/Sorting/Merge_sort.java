package DSA.Sorting;
import java.util.*;
class mergedata
{
    void devide(int arr[],int start,int end)
    {
        if(start<end)
        {
            int mid=start+(end-start)/2;
            //left
            devide(arr,start,mid);
            //right
            devide(arr, mid+1, end);
            //to merge the sorted arrays
            merge(arr,start,mid,end);
        }
    }
    void merge(int arr[],int start,int mid,int end)
    {
     Vector<Integer> temp=new Vector<>();
     int i=start;
     int j=mid+1;
     while(i<=mid&&j<=end)
     {
        if(arr[i]>arr[j])
        {
            temp.add(arr[j]);
            j++;
        }
        else
        {
            temp.add(arr[i]);
            i++;
        }
     }
     while(i<=mid)
     {
        temp.add(arr[i]);
        i++;
     }
      while(j<=end)
     {
        temp.add(arr[j]);
        j++;
     }
     for(int ind=0;ind<temp.size();ind++)
     {
       arr[start+ind]=temp.get(ind);
     }
    }
}
public class Merge_sort
{
    public static void main(String[] args) {
        int arr[]={4,3,6,5,2,8};
        mergedata obj=new mergedata();
        obj.devide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
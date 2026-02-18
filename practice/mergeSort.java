import java.util.*;
class mergedata
{
  void divide(int []arr,int start,int end)
  {
    if(start<end)
    {
        int mid=start+(end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
  }
  void merge(int arr[],int start,int mid,int end)
  {
    Vector<Integer> temp=new Vector<>();
    int i=start;
    int j=mid+1;
    while(i<=mid && j<=end)
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
public class mergeSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,7,4,6,8,92};
        mergedata obj=new mergedata();
        obj.divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}

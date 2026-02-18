package daily_coding;
public class Day09_FindSecondLargest {
    public static void main(String a[])
    {
        int n=5;
        int arr[]={32,33,43,55,34};
        int max=0,k=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
           max=arr[i];
           k=i;
          }
        }
        max=0;
        for(int i=0;i<arr.length;i++)
        {
          if(i==k)
          continue;
          if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("second max"+max);
    }
}

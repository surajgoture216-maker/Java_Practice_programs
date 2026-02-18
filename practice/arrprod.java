import java.util.Scanner;
class first
{
    public int bigger(int[] arr1)
    {  
        int big=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>arr1[big])
            big=i;
        }
      return big;
       
    }
    public int smallsum(int[] arr)
    {   int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
public class arrprod
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.err.println("enter n value");
        int N=sc.nextInt();
        System.out.println("enetr k value");
       int K=sc.nextInt();
       int arr[]=new int[N];
       for(int i=0;i<N;i++)
       {
        arr[i]=sc.nextInt();
       }  
       int small_sum1=0;
       int b;
            first obj=new first();
            for(int i=0;i<K;i++)
            {
             b=obj.bigger(arr);
            arr[b]=arr[b]/2;
            small_sum1=obj.smallsum(arr);
            }
        System.out.println("sum="+small_sum1);
    }
}
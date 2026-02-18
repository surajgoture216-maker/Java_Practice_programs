package daily_coding;
import java.util.*;
class ForFunction
{
    public int calculate(int arr[],int w)
    { 
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++)
      {
        if(w>arr[i])
        {
            w-=arr[i];
            continue;
        }
        return i;
      }
      return 0;
    }
}
public class Day19_Maxsandwiches
{
    public static void main(String a[])
    {
    int []arr={2,3,4,2,34,33,43,1,2,3};
    int w=20;
     ForFunction obj=new ForFunction();
     int wt=obj.calculate(arr,w);
     System.out.println(wt);
    }
}
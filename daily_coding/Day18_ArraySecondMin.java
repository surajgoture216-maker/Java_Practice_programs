package daily_coding;

public class Day18_ArraySecondMin{
    public static void main(String a[])
    {
        int arr[]={1,2,2,3,4,2,3,2,1};
        int finalindex=arr.length-1,index=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            { 
                 if(i==j)
                 continue;
                if(arr[i]==arr[j])
                {
                  index=j;
                  break;
                }
            }
            if(index<=finalindex)
              finalindex=index;
        }
        System.out.println(arr[finalindex]);
    }
}

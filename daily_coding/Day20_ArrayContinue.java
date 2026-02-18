package daily_coding;

public class Day20_ArrayContinue {
    public static void main(String a[])
    {
        int []arr={2,3,2,4,2,4,5,6,3,7,9,7,10,11,4};
        int n=0,k;
        for(int i=0;i<arr.length;i++)
        {  k=1;
            for(int j=i;j<arr.length-1;j++)
            {
             if(arr[j]<arr[j+1])
             {
                k++;
                continue;
             }
             if(j-i+1>n)
             n=j-i+1;
             break;
            }
            
        }
        System.out.println(n);
    }
}

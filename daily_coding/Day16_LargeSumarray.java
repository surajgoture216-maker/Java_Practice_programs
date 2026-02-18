package daily_coding;
public class Day16_LargeSumarray{
    public static void main(String args[])
    {
        int arr[]={2,-1,3,7,-5,-8};
        int max1=0,max=0,max2=0;
        for(int i=0;i<arr.length;i++)
        {  max2=0;
           max1=0;
            for(int j=i;j<arr.length;j++)
            {   
                if(max1+arr[j]>max2)
                 max2=max1+arr[j];
                max1+=arr[j];
            }
            if(max2>max)
              max=max2;
        }
        System.out.println(max);
    }
}
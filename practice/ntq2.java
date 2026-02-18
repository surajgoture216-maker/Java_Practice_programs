import java.util.*;
class calculator{
    public void calculate(int arr[],int i)
    { 
      for(int k=i;k<arr.length;k++)
              { 
                if(k==arr.length-1)
                   return;
                int temp=arr[k];
                arr[k]=arr[k+1];
                arr[k+1]=temp;
              }
    }
}
public class ntq2 {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calculator obj=new calculator();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
              obj.calculate(arr,i);
        }
       System.out.println(Arrays.toString(arr));
    }
}

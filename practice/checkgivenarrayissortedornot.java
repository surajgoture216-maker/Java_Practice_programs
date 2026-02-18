import java.util.*;
public class checkgivenarrayissortedornot {
    public static int check(int arrr[],int n)
    {
     if(n==0)
        return 1;
    int k=arrr[n];
     if(k>check(arrr,n-1))
     {
      //  return 1;
     }
     return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,3,7,5,6};
        int a=check(arr,arr.length-1);
        System.out.println(a);

    }
}

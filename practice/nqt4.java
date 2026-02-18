import java.util.*;
class solution
{
    public int result(int arr[],int n)
    { 
      int occure;
      ArrayList<Integer> occurance=new ArrayList<>();
      ArrayList<Integer> values=new ArrayList<>();
      for(int i=0;i<n;i=i+occure)
      {
        occure=1;
        values.add(arr[i]);
        for(int j=i+1;j<n;j++)
        {
          if(arr[i]==arr[j])
          {
            occure++;
            continue;
          }
          break;
        }
         occurance.add(occure);
      }
      System.out.println(occurance);
      System.out.println(values);
      for(int i=0;i<occurance.size();i++)
      { if(i==0)
          {
        if(occurance.get(i)==occurance.get(i+1)||occurance.get(i)==occurance.get(i+2))
            continue;
          }
        else if(i==occurance.size()-1)
         {
        if(occurance.get(i)==occurance.get(i-1)||occurance.get(i)==occurance.get(i-2))
            continue;
         }
        else if(occurance.get(i)==occurance.get(i-1)||occurance.get(i)==occurance.get(i+1))
            continue;
        return values.get(i);
      }
       return 0;
    }
}
public class nqt4 {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        solution obj=new solution();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        int value=obj.result(arr,n);
        System.out.println(value);
    }
}

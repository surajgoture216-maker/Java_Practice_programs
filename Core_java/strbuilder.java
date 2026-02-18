import java.util.*;
class strbuilder
{
   
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int rollno[]=new int[30]  ;
  int n;
  System.out.println("entre the size of an array");
  n=sc.nextInt();
  System.out.println("enter the elements of array");
  for(int i=0;i<n;i++)
  {
     rollno[i]=sc.nextInt();
  }
  int small1=rollno[0],small2=rollno[0];
  for(int i=0;i<n;i++)
  {
    if(rollno[i]<small1)
    {
      small1=rollno[i];

    }
    
  }
  for(int i=0;i<n;i++)
  {
    if(rollno[i]==small1)
    {
      continue;
    }
    else
    {
      if(rollno[i]<small2)
            small2=rollno[i];

    }
    
  }
  int sum=small1+small2;
  System.out.println(small1+"two"+small2+"="+sum);
 }
}

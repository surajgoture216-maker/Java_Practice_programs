package daily_coding;
import java.util.Scanner;
public class Day07_No_Palindrom {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
       int number=sc.nextInt();
       int no1=number;
       int number2=0;
       while(number>0)
       {
           int rem=number%10;
           number2=number2*10+rem;
           number/=10;
       }
       if(no1==number2)
         System.out.println("palindrom");
       else
         System.out.println("not palindrom");
           }
}

package daily_coding;
import java.util.Scanner;
public class Day02_StringPermulation_Check {
    public static void main(String a[])
    {   
        Scanner sc=new Scanner(System.in);
    //     System.out.println("enter first String");
    //     String st1=sc.nextLine();
    //     System.out.println("enter second String");
    //     String st2=sc.nextLine();
    //     String str3="";
    //      for(int i=st1.length()-1;i>=0;i--)
    //     { 
    //          str3=str3+st1.charAt(i);
    //     }
    //    String result=str3.equals(st2)?"true":("false");
    //    System.out.println(result);
       StringBuilder obj=new StringBuilder(sc.nextLine());
       StringBuilder obj1=new StringBuilder(sc.nextLine());
       obj.reverse();
       String result=obj.toString().equals(obj1.toString())?"true":"false";
       System.out.println(result);
    }
}

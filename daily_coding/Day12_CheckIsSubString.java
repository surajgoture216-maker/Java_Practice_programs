package daily_coding;
import java.util.Scanner;
public class Day12_CheckIsSubString {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first String");
        String str1=sc.nextLine();
        System.out.println("enter second string");
        String str2=sc.nextLine(); 
        if(str1.length()>str2.length())
        {
           if(str1.contains(str2))
             System.out.println("yes its a substring");
           else
             System.out.println("not substring");
        }
        else
        {
          if(str2.contains(str1))
            System.out.println("yes its a substring");
          else
            System.out.println("not substring");
         }
    }
}

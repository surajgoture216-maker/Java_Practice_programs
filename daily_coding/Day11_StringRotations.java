package daily_coding;
import java.util.Scanner;
public class Day11_StringRotations {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first String");
        String str1=sc.nextLine();
        System.out.println("enter second String ");
        String str2=sc.nextLine();
        if(str1.length()!=str2.length())
            System.out.println("flase");
        else
        {
        outer:
        for(int i=0;i<str1.length();i++)
        {
            for(int j=str2.length()-i-1;j>=0;j--)
            {
             if(str1.charAt(i)==str2.charAt(j))
             {
               if(i==str1.length()-1&&j==0)
                 System.out.println("true");
               continue outer;
             }
             else
              System.out.println("flase");
              break outer;
            }
        }
    }
}
}

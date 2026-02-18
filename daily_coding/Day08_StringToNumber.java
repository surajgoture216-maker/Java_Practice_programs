package daily_coding;
import java.util.Scanner;
public class Day08_StringToNumber {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int number=0;
        for(int i=0;i<str.length();i++)
        {
         int n=str.charAt(i)-'0';
         number=number*10+n;
        }
        System.out.println(number);
    }
}

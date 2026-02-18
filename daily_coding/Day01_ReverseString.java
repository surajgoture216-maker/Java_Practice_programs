package daily_coding;
import java.util.Scanner;
public class Day01_ReverseString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        StringBuilder str3=new StringBuilder();
        StringBuffer str2=new StringBuffer();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
           str3.append(str.charAt(i));
           str2.append(str.charAt(i));
           str1=str1+str.charAt(i);
        }
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1);
    }
}

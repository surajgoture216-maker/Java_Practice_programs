package daily_coding;
import java.util.Scanner;
import java.util.Scanner;
public class Day14_StringCharReplace {
    public static void main(String a[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your String");
        StringBuilder str=new StringBuilder(sc.nextLine());
       for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i)==' ')
        str.replace(i,i+1,"%20");
       }
    System.out.println(str);
}}

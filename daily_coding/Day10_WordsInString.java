package daily_coding;
import java.util.Scanner;
public class Day10_WordsInString {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String str=sc.nextLine();
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
             System.out.println();
             continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}

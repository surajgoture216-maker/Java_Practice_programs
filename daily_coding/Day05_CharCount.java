package daily_coding;
import java.util.Scanner;
public class  Day05_CharCount{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String k="";
       int count=0;
       for(int i=0;i<str.length();i++)
       {
         count=0;
         if(k.contains(Character.toString(str.charAt(i))))
         continue;
         k=k+str.charAt(i);
        for(int j=0;j<str.length();j++)
        {
           if(str.charAt(i)==str.charAt(j))
           {
            count++;
           }
        }
        System.out.println(str.charAt(i)+"="+count);
       }
    }
}
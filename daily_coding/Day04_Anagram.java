package daily_coding;
import java.util.Scanner;
public class  Day04_Anagram{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String one=sc.nextLine();
       String two=sc.nextLine();
       boolean flag=false;
       if(one.length()==two.length())
       {
         for(int i=0;i<one.length();i++)
         {
            if(two.contains(Character.toString(one.charAt(i))))
                continue;
            flag=true;
            System.out.println("not a anagram");
            break;
         }
         if(!flag)
         System.out.println("two strings are anagrams");
       }
       else
       System.out.println("not Anagram");
    }
}
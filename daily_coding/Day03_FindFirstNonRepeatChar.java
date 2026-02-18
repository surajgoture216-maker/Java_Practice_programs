package daily_coding;
import java.util.Scanner;
public class Day03_FindFirstNonRepeatChar {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();
       outer:
       for(int i=0;i<name.length();i++)
       {   
         for(int j=0;j<name.length();j++)
          {
            if (i==j)
             continue;
            if(name.charAt(i)==name.charAt(j))
             continue outer;
          }
          System.out.println(name.charAt(i));
           break;
    }
}
}

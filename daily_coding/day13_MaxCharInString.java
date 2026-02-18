package daily_coding;
import java.util.Scanner;
public class day13_MaxCharInString {
    public static void main(String a[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your String");
        String str=sc.nextLine();
        String str1="";
        int count,max=0,index=0;
        for(int i=0;i<str.length();i++)
        {   count=0;
            if(str1.contains(Character.toString(str.charAt(i))))
            continue;
            str1=str1+str.charAt(i);
          for(int j=i+1;j<str.length();j++)
          {
            if(str.charAt(i)==str.charAt(j))
                count++;
          }
          if(max<count)
          {
          max=count;
          index=i;
        }
        }
        System.out.println("maximum occurance of the character in the String is :  "+str.charAt(index)+"="+max);
    }
}

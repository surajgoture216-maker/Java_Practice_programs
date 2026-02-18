package daily_coding;

public class Day06_StringAlpaCheck {
    public static void main(String a[])
    {
      String str="abcfvjihjcduh@";
      str.toLowerCase();
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z' )
        {
            if(i == str.length()-1)
               System.out.println("it contains all alphabets only");
            continue;
        }
        System.out.println("not all alphabets");
        break;
      }
    }
}

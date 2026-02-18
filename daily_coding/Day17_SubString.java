package daily_coding;

public class Day17_SubString {
    public static void main(String a[])
    {
        String str="abcaccbhf";
        String str1="";
        String subString="";
        for(int i=0;i<str.length();i++)
        {   str1="";
           for(int j=i;j<str.length();j++)
           {
            if(!str1.contains(Character.toString(str.charAt(j))))
            {
               str1=str1+str.charAt(j);
               if(str1.length()>subString.length())
                subString=str1;
            }
            else
                break;
           }
        }
        System.out.println(subString);
    }
}

package daily_coding;

public class Day22_Cmnprefixofstring {
    public static void main(String a[])
    {
        String []name={"suraj","surya","supriya","sumit"};
        String prefix="";
        outer:
        for(int n=0;n<name[0].length();n++)
        {    char s=name[0].charAt(n);
            for(int k=1;k<name.length;k++)
            {
                if(name[k].charAt(n) ==  s)
                {
                    continue;
                }
                break outer;
            }
            prefix=prefix+name[0].charAt(n);
        }
       System.out.println(prefix);
    }
}

package daily_coding;
public class Day14_StringIsomorpic {
    public static void main(String a[])
    {
        String str1="kkk";
        String str2="abc";
        int count=0,count1=0;
        boolean set=true;
        if(str1.length()==str2.length())
         { outer:
            for(int i=0,k=0;i<str1.length()&&k<str2.length();i++,k++)
            {   count=0;
                count1=0;
                for(int j=i,m=k;j<str1.length()&&m<str2.length();j++,m++)
                {  if(i==j)
                        { count++;
                          count1++;
                          continue;}
                    if(str1.charAt(i)==str1.charAt(j))
                        count++;
                    if(str2.charAt(k)==str2.charAt(m))
                        count1++;
                    if(str1.charAt(i)!=str1.charAt(j))
                    continue outer;
                    if(count==count1)
                       continue;
                    if(count!=count1){
                      set=false;
                      break outer;}
                }
            }
            if(set)
         System.out.println(true);
         else
         System.out.println("false");
         }
         else
         System.out.println("false");
}          
}
 
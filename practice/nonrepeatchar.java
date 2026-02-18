public class nonrepeatchar {
    public static void main(String[] args) {
        String str="suraj";
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {                      
            flag=false;
            for(int j=i+1;j<str.length();j++)
            {  
                if(str.charAt(i)==str.charAt(j))
                {
                    flag=true;
                }
            }
            if(flag==false)
            {
             System.out.println(str.charAt(i));
             break;
            }
        }
    }
}

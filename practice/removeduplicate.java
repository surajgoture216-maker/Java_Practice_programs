public class removeduplicate {
    public static void main(String[] args)
    {
        StringBuilder sb= new StringBuilder("abbcabddsshhuuddhdhdhdhc");
        StringBuilder sc=new StringBuilder("");
        sc.append(sb.charAt(0));
        for(int i=0;i<sb.length();i++)
        {    boolean flag=false;
            for(int j=0;j<sc.length();j++)
            {
                if(sb.charAt(i)==sc.charAt(j))
                {
                    flag=true;
                }
            }
            if(flag==false)
                    sc.append(sb.charAt(i));
            
        }
        System.out.println(sc);
    }
}

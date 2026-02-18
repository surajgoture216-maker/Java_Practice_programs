public class stringreverse {
    public static void main(String [] args)
    {
        StringBuilder sb=new StringBuilder("suraj");
        System.out.println(sb);
        StringBuilder sc=new StringBuilder("");
        for(int i=sb.length()-1;i>=0;i--)
        {
            sc.append(sb.charAt(i));
        }
        System.out.println(sc);
    }
}

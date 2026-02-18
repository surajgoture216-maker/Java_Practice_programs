public class palindrom {
    public static void main(String [] args)
    {
        StringBuilder sc=new StringBuilder("abba");
        StringBuilder sb= new StringBuilder("");
        for(int i=sc.length()-1;i>=0;i--)
        { 
             sb.append(sc.charAt(i));
           
        }
        System.out.println(sc);
         System.out.println(sb);
        if(sb.compareTo(sc)==0)
        {
            System.out.println("its  a palindrom");
        }
        else
        System.out.println("its  not a palindrom");

    }
    
}

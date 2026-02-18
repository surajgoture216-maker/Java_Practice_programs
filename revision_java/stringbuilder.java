package revision_java;
public class stringbuilder
{
    public static void main(String []a)
    {
       StringBuilder name=new StringBuilder("suraj");
       for(int i=0;i<name.length();i++)
       {
        System.out.println(name.charAt(i));
       }
       System.out.println(name.charAt(2));
       name.setCharAt(0, 'g');
       System.out.println(name);
       name.insert(3, "suaar");
       System.out.println(name);
       name.append("sutr");
       System.out.println(name);
       name.delete(0, 3);
       System.out.println(name);
       System.out.println(name.isEmpty());
       System.out.println(name.reverse());
       name.replace(0, 2, "shr");
       System.out.println(name);

    }
}
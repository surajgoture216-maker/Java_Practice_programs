package revision_java;
import java.util.Scanner;

public class strings {
    public static void main(String a[])
    {
        String name="suraj";
        name=name+"surr";
        for(int i=0;i<name.length();i++)
        {
           System.out.println(name.charAt(i));
        }
         //to check that name contains s alphabet or not
    System.out.println(name.startsWith("sur"));
    System.out.println(name.startsWith("suar"));
    System.out.println(name.contains("s"));
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.equals("suraj"));
    System.out.println(name.equalsIgnoreCase("Sursaj"));
    System.out.println(name.compareTo("hello"));
    System.out.println(name.length());
    System.out.println(name.endsWith("ax"));
    System.out.println(name.substring(0,4));
    System.out.println(name.indexOf('s'));
    }
   
}

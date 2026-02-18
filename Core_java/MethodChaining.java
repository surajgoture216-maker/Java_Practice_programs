import java.math.*;
public class MethodChaining {
    public static void main(String[] args) {
        double a =10;
        // its a method chaining in java for  the integers 
        a=Math.sqrt(Math.abs(a));
        //this is normal string operations 
        String name="Suraj Goture";
        String s1=name.replace(" ","_");
        String s2=s1.concat(" ");
        String s3=s2.concat("Java programmer");
        String s4=s3.replace(" ","_");
        System.out.println(s4);
        // now instead of doing these all line of code we 
        // can just able to do this in one single line of code
        String name1="Shree Morti";
        String name2=name.replace(" ","_").concat(" ").concat("Java developer").replace(" ","_");
         System.out.println(name2);
         //both will give you same output
    }
    
}

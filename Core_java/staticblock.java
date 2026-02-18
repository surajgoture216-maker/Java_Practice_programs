 class staticblock1 {
    static int x=20;
    int y=40;
    // this is the static block used to initialise the static keywords
    static{
        System.out.println("hello this is the first static block");
    }
    static{
        System.out.println("this is the second static block");
        System.out.println("x="+x);
    }
    public staticblock1()
    {
        System.out.println("this is the constructor");
    }
}
public class staticblock{
    public static void main(String [] args) throws  ClassNotFoundException
    {   
        Class.forName("staticblock1");
        System.out.println("this is the main method");
    }
        
    
}

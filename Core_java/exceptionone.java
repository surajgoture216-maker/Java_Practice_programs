public class exceptionone {
    public static void main(String []args)
    {
    int a=10;
    int b=0;
    int c;
    try{
    c=a/b;
    System.out.println(c);
    }
    catch(Exception e)
    {
        System.out.println(e);
        System.out.println("error ");
    }
    finally
    {
       System.out.println("this is the finally block and it executes all the time");
    }
    }
}

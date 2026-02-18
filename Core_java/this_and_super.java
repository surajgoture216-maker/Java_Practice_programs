class A
{
  public A()
  { this(5);
    System.out.println("this a constructor");
  }
  public A(int n)
  { 
    System.out.println("thid A constructor with parameter");
  }
}
class B extends A
{
    public B()
    {
        System.out.println("this is constructor of B");
    }
    public B(int n)
    {   this();
        System.out.println("this is constructor of B with parameter");
    }

}
public class this_and_super{ 
    public static void main(String []args)
    {
    B obj=new B(5);
    }
}

  class final1{  
    //final variable in java its not able to redeclare and reassign once you declare in that  time only you have to assign value for that
  final int s=20;
  //final method can also possible in java 
  //if you make a methos as the final then you are not able to override that method in sub classes
  //final methos should be called from own method only
  final void method1()
  {
    System.out.print("this is the method");
  }
} 
// in java we can also able to make a claass as a final 
// if class is a final then we not able to inherite that class
final class B extends final1
{  

    public void b()
   { 
    System.out.print("hello");
}
}
public class _final {
    public static void main(String []args)
    {
        B obj=new B();
        System.out.println("a="+obj.s);
        final1 obj1=new final1();
        obj1.method1();
    }
}

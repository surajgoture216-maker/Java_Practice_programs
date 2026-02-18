class name {
    // this is the instance block 
    // it is with without name method
    //it executes before the constructure
    //after the static block
    {
        System.out.println("hello this is the instance block");
    }
    //this is cunstructor it run automatically when you create an object on the class
    // but in this it execute after the instance block
     public name()
     {
        System.out.println("this is the construcure");
     }
     // the static block will run first in the any program bcz it run when the class is load in the jvm
     static{
        System.out.println("hello  this is the static block");
     }
}
public class instanceBlock {
    public static void main(String [] a)
    {
        name obj=new name();   }
}

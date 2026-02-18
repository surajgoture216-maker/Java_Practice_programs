import java.util.function.*;
import java.util.*;
//this is supplier type of functional interface
//no input one return value
interface one
{
    int get();
}
//this is consumer type functional interface
//one input no return value
interface two{
  void dispplay(String name);
}
//this is for Function type of funtional interface
//one return and one input
interface three
{
    int getout(int n);
}
//this is the type of the runnabel type of functional interface
//no input also no return anything
interface four {
 void runnable();
}
//this is for predicate type of functional interface
//one input always return boolean value
interface five{
    boolean dis(int n);
}
public class lamda {
    public static void main(String []a)
    {   //this is the lamda expression
        //if you have more line in function then use curly brace 
        one obj=()->4;
        System.out.println(obj.get());
        //this is for cunsumer type lamda function
        two obj1=(String name)-> System.out.println("this is name"+name);
        obj1.dispplay("Suraj");
        // this is for Function type of functional interface
        three obj2=(int n)->5;
        System.out.println(obj2.getout(45));
        // this is for runnabel type of interface function
        four obj3=()->System.out.println("hello");
        obj3.runnable();
        // this is speacially for predicate type of functional interface
        five obj4=(int x)-> x>5;
        System.out.println(obj4.dis(40));
    }
    
}

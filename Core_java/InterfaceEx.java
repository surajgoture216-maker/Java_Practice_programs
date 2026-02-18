interface computer
{  
//this us like a final static variablenot able ton reassign nd direct access through the interface name
   int a=10;
//its like a abstract class you can only able declare it here 
   void code();
}
//if you inherite from the interface then you must have a all those methods in this class
class laptop implements computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
class desktop implements computer
{
     public void code()
     {
        System.out.println("code, compile,run:faster");
     }
}
class Devloper
{  //this argument is object of the computer class 
    public void devApp(computer lap)
    {
        lap.code();
    }
}
public class InterfaceEx {
    public static void main(String args[])
    {  // object for the devloper class
       Devloper suraj =new Devloper();
       //creating the object of laptop class with reference of the computer interface
       computer lap=new laptop();
       //creating the object of desktop class with reference of the computer interface
       computer desk=new desktop();
       suraj.devApp(lap);
       suraj.devApp(desk);
       //accesing the final static variable from interface a
       //computer.a=20; 
       //its not possible bcz the interface variables are default final variables 
       System.out.println(computer.a);
    }
    
}


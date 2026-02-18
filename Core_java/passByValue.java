class example
{
     String name;
     int age;
     void set(String name,int age)
     {
        this.name=name;
        this.age=age;
     }
     void display()
     {
        System.out.println("name="+name+"\n age="+age);
     }
}
public class passByValue {
    public static void main(String []a)
    {
        example obj=new example();
        // this is the call by value
        obj.set("suraj", 21);
        obj.display();
        example obj1=new example();
        System.out.println(obj.name);
        //this is call by reference
        obj1.set(obj.name,25);
        obj1.display();
    }
}

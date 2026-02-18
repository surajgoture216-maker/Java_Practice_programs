record Employee(int id,String name)
{ 
      Employee()
    {
        this(0,"");
        if(id<100)
        throw new IllegalArgumentException("id should be greater then 100");
    }
   final public static int ids=103;
   public int getid()
   {
    return id;
   }
}
public class Recordsclass {
    public static void main(String args[])
    {
        Employee obj=new Employee(90, "suraj");
        System.out.println(obj);
        System.out.println(obj.name());
        System.out.println(obj.id());
        System.out.println(obj.getid());
    }
    
}

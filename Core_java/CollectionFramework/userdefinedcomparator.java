package CollectionFramework;
import java.util.*;
class employee
{
    int id;
    String name;
    public employee(int id,String name)
    {
    this.name=name;
    this.id=id;
    }
    public String toString()
    {
      return name+"--"+id;
    }
}
public class userdefinedcomparator {
    public static void main(String a[])
    {
      employee e1=new employee(1,"suraj");
      employee e2=new employee(2,"sanket");
      employee e3=new employee(3,"shridhar");
      employee e4=new employee(4,"sachin");
      employee e5=new employee(5,"praveen");
      TreeSet t1=new TreeSet(new myclass());
      t1.add(e1);
      t1.add(e2);
      t1.add(e3);
      t1.add(e4);
      t1.add(e5);
      System.out.println(t1);
    }
}
class myclass implements Comparator
{  
    public int compare(Object v1,Object v2)
    {
      employee e1=(employee)v1;
      employee e2=(employee)v2;
      return (e1.name).compareTo(e2.name);
    }
}

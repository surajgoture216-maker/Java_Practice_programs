package CollectionFramework;
import java.util.*;
class employee implements Comparable
{  
    String name;
    int id;
    public employee(String name ,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String toString()
        return name+"__"+id;
    public int compareTo(Object v1)
    {   
        int id1=this.id;
        employee e=(employee)v1;
        int id2=e.id;
        if(id1>id2)
            return +1;
        else if(id2>id1)
            return -1;
        else 
            return 0;
    }
}
class mycomparator implements Comparator
{
    public int compare(Object v1,Object v2)
    {
        employee e1=(employee)v1;
        employee e2=(employee)v2;
        String name=e1.name;
        String name2=e2.name;
        int id=e1.id;
        int id2=e1.id;
        if(name.length()>name2.length())
            return -1;
        else if(name.length()<name2.length())
            return +2;
        else 
            if(id>id2)
                return -1;
            else
                return +1;
     }
}
public class userDefinedclasstreeset {
    public static void main(String a[])
    {
      employee e1=new employee("suraj",1);
      employee e2=new employee("vishal",2);
      employee e3=new employee("sanket",3);
      employee e4=new employee("sachin",4);
      employee e5=new employee("shridhar",5);
      employee e6=new employee("praveen",6);
      TreeSet t1=new TreeSet(new mycomparator());
      t1.add(e1);
      t1.add(e2);
      t1.add(e3);
      t1.add(e4);
      t1.add(e5);
      t1.add(e6);
      System.out.println(t1);
      TreeSet t2=new TreeSet();
      t2.add(e1);
      t2.add(e2);
      t2.add(e3);
      t2.add(e4);
      t2.add(e5);
      t2.add(e6);
      System.out.println(t2);
    }
}

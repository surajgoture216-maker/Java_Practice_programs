package CollectionFramework;
import java.util.*;
public class Vectorclass {
    public static void main(String ar[])
    {
        Vector v1=new Vector(34,5);
        Vector v2=new Vector(34);
         Vector v3=new Vector();//it contains initial capacity as 10
         /// its from 1.0 version  of java
         /// its also called as a legacy class of java
         //you can able to use all collection and list interface 
         //it contains some more methods 
         v1.addElement(37);
         v1.capacity();
         v1.firstElement();
         v1.lastElement();
         v1.removeElementAt(1);
         v1.removeAllElements();
         v1.removeElement(3);
         v1.elementAt(2);
         //to iterate through all values in the vectore we use one special cursor 
         /// that is a enumeration 
         /// its also called a legacy interface its also from java 1.0
         /// its works with only vector and hashtable
         Enumeration enm=v1.elements();
         while(enm.hasMoreElements())
         {
            System.out.println(enm.nextElement());
         }
    }
}

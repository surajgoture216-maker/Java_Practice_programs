import java.util.*;
public class LinkedListBuiltIn {
    public static void main(String a[])
    {
      LinkedList obj=new LinkedList();
      //add first element
      obj.addFirst(30);
      obj.addFirst(33);
      obj.addFirst(37);
      System.out.println(obj);
      //add last element
      obj.addLast(36);
      System.out.println(obj);
      //remove first element
      obj.removeFirst();
      System.out.println(obj);
      //remove last element
      obj.removeLast();
      System.out.println(obj);
      // append value in last
      obj.add(43);
      obj.add(30);
      //get value by index value
      System.out.println(obj.get(1));
      System.out.println(obj.getFirst());
      System.out.println(obj.contains(30));
      System.out.println(obj.size());
      System.out.println(obj.lastIndexOf(30));
    }
}

import java.util.*;
public class set {
    public static void main(String args[])
    {  // use hashset when you want speed iterations and work 
        Set<String> arr=new HashSet<String>();
        arr.add("48");
        arr.add("38");
        arr.add("28");
        arr.add("18");
        arr.add("43");
        arr.add("43");
        arr.add(null);
        System.out.println(arr.toString());
        //use tree set when you want all set data in order
        Set<Integer> arr1=new TreeSet<Integer>();
       arr1.add(30);
       arr1.add(32);
       arr1.add(33);
       arr1.add(3);
       arr1.add(10);
       arr1.add(20);
      System.out.println(arr1.toString());
      // when you want the set element in order how you inserted then use LinkedListSet
      Set <Integer> arr2= new LinkedHashSet<Integer>();
      arr2.add(10);
      arr2.add(1);
      arr2.add(90);
      arr2.add(12);
      arr2.add(40);
      System.out.println(arr2.toString());
      Object[] a=arr.toArray();
      System.out.println(Arrays.toString(a));
      for( Integer ax:arr2)
      System.out.print(ax+",");
      Iterator<Integer> value=arr2.iterator();
      while(value.hasNext())
      {
        System.out.print(value.next()+",");
      }
    }
}

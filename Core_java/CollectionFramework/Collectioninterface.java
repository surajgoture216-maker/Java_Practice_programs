import java.util.*;
public class Collectioninterface
{
 public static void main(String ar[])
 {
   Listinterface<Integer> l1=new ArrayList<>();
   ArrayList l2=new ArrayList();
   l2.add(38);
   l2.add(47);
   //thise given all are collection interface methods
   //it contains totally 12 methods its can be used--
   // -- with all the interfaces and colllection present in the collection framework
   l1.add(1);
   l1.addAll(l2);
   l1.remove(1);
   l1.removeAll(l2);
   l1.retainAll(l2);
   l1.clear();
   l1.size();
   l1.isEmpty();
   l1.toArray();
   Iterator ite=l1.iterator();
   l1.contains(34);
   l1.containsAll(l2);

 }
}
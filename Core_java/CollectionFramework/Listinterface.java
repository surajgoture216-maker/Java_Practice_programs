package CollectionFramework;
import java.util.*;
public class Listinterface {
    public static void main(String ar[])
    {
        ArrayList arr=new ArrayList();
        List<String> l2=new ArrayList<>();
        // this all methods are present in the list interface 
        // we can also able to use all methods of collection interface
        arr.add(34);
        arr.addAll(l2);
        arr.remove(1);
        arr.removeAll(l2);
        arr.get(2);
        arr.set(1,23);
        arr.add(2,34);
        arr.addAll(2,l2);
        arr.indexOf(23);
        arr.lastIndexOf(23);

    }
}

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String a[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(20);
        arr.add(26);
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(27);
        arr.add(19);
        System.out.println("access element 1:"+arr.get(0));
        arr.set(3,101);
        System.out.println(arr.toString());
        System.out.println(arr.contains(102));
        Collections.sort(arr);
        System.out.println(arr.toString());
        System.out.println("size of arraylist:"+arr.size());
        arr.remove(6);
        System.out.println(arr.toString());
        arr.clear();
        System.out.println(arr.isEmpty());



    }
}

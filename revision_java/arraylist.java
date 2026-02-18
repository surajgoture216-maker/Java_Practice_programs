package revision_java;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String ar[])
    {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(10);
    arr.add(30);

    System.out.println(arr.toString());
    System.out.println(arr.isEmpty());
    System.out.println(arr.contains(498));
    arr.set(1,33);
    System.out.println(arr.get(1));
    arr.remove(0);
    Collections.sort(arr);
    System.out.println(arr);
    System.out.println(arr);
    arr.add(1,333);
    System.out.println(arr);
    System.out.println(arr.size());
    arr.clear();
   System.out.println(arr);
    }
}

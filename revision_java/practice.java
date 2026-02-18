package revision_java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class practice {
    
    public static void main(String args[])
    {
      ArrayList<Integer> arr=new ArrayList<>();
      arr.add(498);
      arr.add(476);
      arr.add(498);
      arr.add(34365);
      arr.add(56);
      arr.add(34365);
      Set<Integer> ar=new LinkedHashSet<>(arr);
      System.out.println(ar);
      Set<Integer> ar1=new HashSet<>(arr);
      System.out.println(ar1);
      Set<Integer> ar2=new TreeSet<>(arr);
      System.out.println(ar2);
      Set<Integer> ar3=new HashSet<>(arr);
      System.out.println(ar3);
      ar3=new TreeSet(arr);
      System.out.println(ar3);
       }
}



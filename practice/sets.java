import java.util.*;
public class sets {
  public static void main(String a[])
  {
    
    Set<Integer> set1=new HashSet<>(Arrays.asList(4,2,4,85,78,5,4,564,66,4,646,45));
    Set<Integer> set2=new HashSet<>(Arrays.asList(4,2,4,5,3,5,56,4,54,4,5,3,43,5,6,4,343));
    Set<Integer> temp=new HashSet<>(set1);
    set1.addAll(set2);
    set1.removeAll(set2);
    set2.addAll(temp);
    set2.removeAll(temp);
    set1.addAll(set2);
    System.out.println(set1);
  }  
}

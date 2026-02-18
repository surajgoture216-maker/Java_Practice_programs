import java.util.*;
public class Arraylist_example {
    public static void main(String AR[])
    {
      ArrayList<Integer> arr=new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      arr.addAll(Arrays.asList(223,45,45,34,23,45,65,45));
      ArrayList <Integer> result=new ArrayList<>();
      for(int i=0;i<arr.size();i++)
      {
        if(result.contains(arr.get(i)))
            continue;
        result.add(arr.get(i));
      }
      System.out.println(result);
    }
}

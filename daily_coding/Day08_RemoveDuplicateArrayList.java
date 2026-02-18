package daily_coding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Day08_RemoveDuplicateArrayList {
    public static void main(String a[])
    { 
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("enter arralist elements one by one");
        for(int i=0;i<5;i++)
        {
            arr.add(sc.nextInt());
        }
        for(int i=0;i<arr.size();i++)
        {
           for (int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)==arr.get(j))
                {
                    arr.remove(j);
                }
            }
        }
        System.out.println(arr.toString());
    }
}

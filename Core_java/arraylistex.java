import java.util.*;
public class arraylistex
{
    public static void main(String [] args)
    {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(25);
        arr.add(2);
        arr.add(12);
        arr.add(5);
        arr.add(10);
        arr.add(8);
        System.out.println(arr);
        ArrayList<Integer> result= new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {   
            for(int j=i+1;j<arr.size();j++)
            {    
                if(arr.get(i) < arr.get(j))
                {
                    result.add(arr.get(j));
                    break;
                }
                if(j==arr.size()-1)
                {
                    result.add(-1);
                }
            }
            if(i==arr.size()-1)
            {
                result.add(-1);
            }
        }
                System.out.println(result);

    }
}

import java.util.ArrayList;

public class nearest {
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>(5);
        ArrayList<Integer> result=new ArrayList<>(5);
        arr.add(8);
        arr.add(7);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(9);
        int max2,max1;
        int index1=0,index2=0;
        System.out.println(arr);
        for(int i=0;i<arr.size();i++)
        {           
            max1=arr.get(i);
            max2=arr.get(i);
            for(int j=i+1;j<arr.size();j++)
            {
              if(arr.get(j)>max1)
              {
                max1=arr.get(j);
                index1=j-i;
                break;
              }
            }
            for(int k=i;k>=0;k--)
            {
              if(arr.get(k)>max2)
              {
                max2=arr.get(k);
                index2=i-k;
                break;
              }
            } 
            if(max1 > arr.get(i) && index1 < index2)
             result.add(max1);
            else if(arr.get(i) < max2 && index1 > index2)
             result.add(max2);
            else if(max1<max2)
             result.add(max2);
            else
             result.add(max1);
        }
        System.out.println(result);
    }
    
}

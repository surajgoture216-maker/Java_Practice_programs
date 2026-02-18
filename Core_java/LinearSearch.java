public class LinearSearch {
    public static void main(String a[])
    {
        int ar[]={1,2,3,4,3,1,4};
        int target=3;
        boolean find=false;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==target)
            { 
              System.out.println("target find at the index"+i+"--"+ar[i]);
              find=true;
            }
        }
        if(!find)
         System.out.println("target not find ");
    }
}

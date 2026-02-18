package daily_coding;

public class Day21_triplesum {
    public static void main(String a[])
    {    int [][]str=new int[10][10];
        String str1="";
        int s=0;
         int arr[]={-1,1,-2,2,3,4,-1,5};
         for(int i=0;i<arr.length;i++)
         {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                   if(arr[i]+arr[j]+arr[k]==0)
                   {  
                      str[s][0]=arr[i];
                      str[s][1]=arr[j];
                      str[s][2]=arr[k];
                      s++;
                   }
                }
            }
         }
         for(int i=0;i<s;i++)
         {
            for(int j=0;j<3;j++)
            {
            System.out.print(str[i][j]);
            }
            System.out.print("\n");
         }
    }
}

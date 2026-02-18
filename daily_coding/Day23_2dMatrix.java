//.Given an n × n matrix, rotate it by 90 degrees clockwise in-place. 
//Example: Input: [[1,2,3],[4,5,6],[7,8,9]] → Output: [[7,4,1],[8,5,2],[9,6,3]]
package daily_coding;

public class Day23_2dMatrix {
    public static void main(String a[])
{
    int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int[][]arr1=new int[arr[1].length][arr.length];
    for(int i=0,k=0;i<arr[0].length;i++,k++)
    {
     for(int j=0,l=arr.length-1;j<arr[0].length&&l>=0;j++,l--)
    {
        arr1[i][j]=arr[l][k];
    }
    }
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr1[i][j]);
        }
    }
}
}

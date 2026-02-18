package revision_java;

public class array {
    public static void main(String ar[])
    {
    int []arr=new int[4];
    int []arr2;
    int []arr1={1,2,3};
    arr2=new int[4];
    int [][]arr3={{1,2,3},{1,2},{2,3,1,2}};
    for(int i=0;i<arr3.length;i++)
    {
        for(int j=0;j<arr3[i].length;j++)
        {
            System.out.println(arr3[i][j]);
        }
    }
    System.out.println(arr3.toString());
    for(int j:arr1)
    {
        System.out.print(j);
    }
}
}
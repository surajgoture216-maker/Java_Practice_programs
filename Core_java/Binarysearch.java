class findtarget{
    int findtargetOne(int []arr,int target,int start,int end)
    {
        int mid=end/2;
        if(arr[mid]==target){
          System.out.println("find at index"+arr[mid]);
          return 0;
        }
        while(start<=end){ 
        if(mid>target)
          findtargetOne(arr,target,start,mid-1);
        else
          findtargetOne(arr,target,mid+1,end);
        return 10;
    }}
}
public class Binarysearch {
    public static void main(String a[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=5;
        findtarget obj=new findtarget();
       int k= obj.findtargetOne(arr,target,0,arr.length-1);
       if(k==10)
             System.out.println("not found");

    }
}

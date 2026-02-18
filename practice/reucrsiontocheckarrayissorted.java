import static org.junit.jupiter.api.Assertions.fail;

public class reucrsiontocheckarrayissorted {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8,9,3};
        System.out.println(check(arr,arr.length-1,0));
    }
    static boolean check(int arr[],int n,int i)
    {  
        if(i<n && arr[i]>arr[i+1])
            return false;
        if(i==n-1)
            return true;
        return check(arr,n,i+1)?true:false;
    }
}

import java.util.Arrays;

public class arraya {
    public static void main(String a[])
    {   //there are threee type of array declaration in java
        //first one declaration 
        int[] arr1;
        //initialisation size and place in heap for that array
        arr1=new int[5];
        //second one declaration with initialisation of values with that how many values in curly braces that is the length of that arry
        int[] arr={1,2,8,3,4};
        //third one array declaration and initialising size in that creating the obj in heap mnemory
        int[] arr2= new int[10];
          

        //some array methods
        System.out.println("array length="+arr.length);
        System.out.println("array to String="+Arrays.toString(arr));
        System.out.println("array search="+Arrays.binarySearch(arr , 8));
        Arrays.sort(arr);
        System.out.println("sorting in array:"+Arrays.toString(arr));
        Arrays.fill(arr2,10);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr, arr2));
        int[] arr3=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr3));

    }
}

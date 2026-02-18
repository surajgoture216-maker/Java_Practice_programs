import java.util.Scanner;

class First {
    public int bigger(int[] arr1) {  
        int big = 0;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > arr1[big])
                big = i;
        }
        return big;
    }

    public int smallsum(int[] arr) {   
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

public class tcscodevita {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int N = sc.nextInt();
        System.out.println("Enter k value:");
        int K = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }  

        First obj = new First();
        int small_sum1 = 0;

        for (int i = 0; i < K; i++) {
            int b = obj.bigger(arr);
            arr[b] = arr[b] / 2; // divide largest element by 2
            small_sum1 = obj.smallsum(arr);
        }

        System.out.println("Sum = " + small_sum1);
    }
}

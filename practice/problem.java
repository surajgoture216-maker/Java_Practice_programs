import java.util.*;
public class problem {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of users");
        int n=sc.nextInt();
        String []users=new String[n];
        int[][] count=new int[n][7];
        Double []avgs=new Double[n];
        Double avg=0.00;
        System.out.println("enter all users one by one");
        for(int i=0;i<n;i++)
        {
            users[i]=sc.next();
        }
        System.out.println("enter the daily count down ofthe each users day by day");
        for(int i=0;i<n;i++)
        {   
            avg=0.00;
            System.out.println("enter the daily count down of "+users[i]);
            for(int j=0;j<7;j++)
            {
               count[i][j]=sc.nextInt();
               avg=avg+count[i][j];
            }
            avg=avg/7;
            avgs[i]=avg;
        }
    System.out.println(Arrays.toString(users));
    System.out.println(Arrays.toString(count));
    System.out.println(Arrays.toString(avgs));

    }
}

import java.util.Scanner;
public class newSwitchcase {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the one number betwen 1 to 10");
        int n=sc.nextInt();
        switch(n)
        {
        case 1,2,3,4,5 -> {
                     System.out.println("thois number is from between ojne to five");
                   }
        case 6,7,8,9,10 -> {
            System.out.println("this number is greater then five and smaller then 11");
        }
        default ->{
            System.out.println("invalid inpput");
        }
                }
    }
    
}

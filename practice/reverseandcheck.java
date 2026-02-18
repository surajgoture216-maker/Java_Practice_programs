public class reverseandcheck {
    public static void main(String[] args) {
        int num=14;
        check(num,0);
    }
    static void check(int num,int steps)
    {
        if(num==0)
        {
            System.out.println(steps);
            return;
        }
        if(num%2==0)
            check(num/2,++steps);
        else
            check(num-1,++steps);
    }
}

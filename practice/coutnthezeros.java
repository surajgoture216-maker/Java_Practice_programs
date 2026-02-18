public class coutnthezeros {
    public static void main(String[] args) {
        int number=2030300;
        check(number,0);
    }
    static void check(int n,int count)
    {
        if(n<10)
        {
            System.out.println(count);
            return;
        }
        check(n/10,n%10==0?++count:count);
    }
}

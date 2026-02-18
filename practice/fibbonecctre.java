class r8
{  
    void fiboneci(int fib1,int fib2,int n)
    {
    if(n==0)
     return;
    int fibv=fib1+fib2;
    System.out.println(fibv);
    fiboneci(fib2, fibv,n-1);
    }
}
public class fibbonecctre {
    public static void main(String[] args) {
        r8 obj=new r8();
        System.out.println(0+"\n"+1);
        obj.fiboneci(0, 1,5);
    }
}

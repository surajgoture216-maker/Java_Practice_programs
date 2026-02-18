public class reversenumberrecursion {
    public static void main(String[] args) {
        int num=345732;
        reverseit(num,0);
    }
    static void reverseit(int num,int total)
    { 
        if(num<10)
        { 
            System.out.println(total*10+num);
            return;
        }
        total=total*10+num%10;
        reverseit(num/10,total);
    }
}

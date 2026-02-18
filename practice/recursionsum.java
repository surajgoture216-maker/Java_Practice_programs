public class recursionsum {
    public static void main(String[] args) {
        System.out.println(function(789456));
    }
    static int function(int n)
    {   
        if(n<10)
            return n;
        return(n%10+function(n/10));
    }
}

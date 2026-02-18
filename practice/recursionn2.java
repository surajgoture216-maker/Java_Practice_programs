public class recursionn2 {
     public  static int calculate(int x,int n)
       { 
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        int value=x*calculate(x,n-1);
       return value;
       }
    public static void main(String[] args) {
        int n=5;
        int x=2;
       
       int value= calculate(x,n);
       System.out.println(value);
      
    }
}

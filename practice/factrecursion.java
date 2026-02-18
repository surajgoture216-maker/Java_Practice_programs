class r2
{  int fact=1;
    void fact(int data)
    {
        if(data==1||data==0) 
         {
            System.out.println(fact);
            return;
        }
        fact=fact*data;
        fact(data-1);
    }
}
public class factrecursion {
    public static void main(String[] args) {
        r2 obj=new r2();
        obj.fact(5);
    }
}

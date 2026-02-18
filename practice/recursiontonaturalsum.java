class r1
{ int x=0;
    void forsum(int data)
    {
        if(data==0)
        {  
            System.out.println(x);
            return ;
        }
         x=x+data;
        forsum(data-1);

    }
}
public class recursiontonaturalsum {
    public static void main(String[] args) {
        r1 obj=new r1();
        obj.forsum(10);
    }
}

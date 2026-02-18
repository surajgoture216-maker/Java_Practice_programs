class forrecurtion
{
    void values(int data)
    {
        if(data==6)
            return ;
        // for forward  printing 
        System.out.println(data*1);
        values(data+1);
        // for bachward printing
        System.out.println(data);
    }
}
public class recursioninjava {
    public static void main(String ar[])
    {
      forrecurtion obj=new forrecurtion();
      obj.values(1);
    }
}

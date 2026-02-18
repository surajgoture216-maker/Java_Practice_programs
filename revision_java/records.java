package revision_java;
record person(int id,String name)
{
   public person()
   {
    this(01,"name");
    if(id==01)
    System.out.println("hello");
   }
}
public class  records {
     static public void main(String a[])
    {
        person one=new person(01,"syuraj");
        person two=new person(02,"sanket");
        System.out.println(one.name());
        System.out.println(one);
        System.out.println(one.toString());
        person obj=new person();
        
    }
}

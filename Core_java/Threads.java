class process1 extends Thread
{
  public void run()
  {
  for(int i=0;i<5;i++)
    System.out.println("pricesss1:"+i);
  }
}
class process3 implements Runnable
{
  public void run()
  {
    for(int i=0;i<5;i++)
      System.out.println("process3:"+i);
  }
}
class process4 implements Runnable
{
  public void run()
  {
    for(int i=0;i<5;i++)
     System.out.println("process4:"+i);
  }
}
class process2 extends Thread
{ 
   public void run(){
    for(int i=0;i<5;i++)
     System.out.println("process2:"+i);
    }
}
public class Threads {
    public static void main(String a[])
    {
      process1 p1=new process1();
      process2 p2=new process2();
      process3 p3=new process3();
      process4 p4=new process4();

      Thread t1=new Thread(p3);
      Thread t2=new Thread(p4);
      p2.start();
      p1.start();
      t1.start();
      t2.start();
    }
}

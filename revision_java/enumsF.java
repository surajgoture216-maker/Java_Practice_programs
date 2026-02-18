package revision_java;
enum signals
{
  RED( "STOP",60),
  GREEN("GO",30),
  YELLOW("READY",10);
  String action;
  int time;
  private signals(String action,int time)
    {
      this.action=action;
      this.time=time;
    }
  public String  getAction(){
    return action;}
}
public class enumsF {
    public static void main(String a[])
    {
      signals signal=signals.RED;
      System.out.println(signal.getAction());
      System.out.println(signal.name());
      signals obj=signals.valueOf("RED");
      System.out.println(obj);
      for(signals d:signals.values())
      {
        System.out.println("signal:"+signals.valueOf(d.name())+" \t action:"+d.getAction());
              System.out.println(d.ordinal());

      }
     }
}

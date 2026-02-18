abstract class car
{
    abstract void ride();
    void playMusic()
    {
        System.out.println("music is on");
    }
}
class alto extends car
{
    void ride()
    {
        System.out.println("ridding the car");
    }
}
public class abstractclass
{
    public static void main(String args[])
    {
        car obj=new alto();
        obj.ride();
        obj.playMusic();
    }
}
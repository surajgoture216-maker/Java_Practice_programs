public class enum1 {
    public enum colors
    {
        red(10),green(3),yellow(20);
        private int num;
        private colors(int num)
        {
            this.num=num;
        }
        public int getnum()
        {
            return num;
        }
    }
    public static void main(String []args)
    {   
        System.out.println(colors.red);
        colors obj=colors.red;
        System.out.println(obj.getnum());
        for(colors ar:colors.values())
        {
            System.out.println(ar.getnum());
            System.out.println(ar.ordinal());
            System.out.println(ar.name());

        }
        colors red=colors.valueOf("red");
        System.out.println(red);
    }
    
}

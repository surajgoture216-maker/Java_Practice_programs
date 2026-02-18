public class deleteovwel {
    public static void main(String[] args) {
        String str1="surajbaeiou";
        String str2="aeiou";
        String str3="";
        for(int i=0;i<str1.length();i++)
        {
            if (str2.contains(Character.toString(str1.charAt(i))))
            {
                continue;
            }
            str3+=str1.charAt(i);
        }
        System.out.println(str3);
    }
}

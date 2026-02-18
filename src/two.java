public class two {
    public static void main(String[] args) {
        String input = "abcabcacacc";
        StringBuilder obj=new StringBuilder();
        StringBuilder obj1=new StringBuilder();
        outerloop:
        for (int i=0;i<input.length();i++)
        {    
             obj.setLength(0);
             obj.append(input.charAt(i));
             for (int j=i+1;j<input.length();j++)
               {
                 boolean dublicate=false;
                 char c=obj.charAt(j);
                 for(int k=0;k<obj.length();k++)
                   {  
                    if(obj.charAt(k)==c)
                     {   
                        
                        {
                         dublicate=true;
                        }
                        break;
                     }
                    }
                    if(dublicate)
                    {
                        if(obj1.length()<obj.length())
                          {
                            obj1.setLength(0);
                            obj1.append(obj);
                          }
                         continue outerloop;
                    }
                    else
                    {
                        obj.append(input.charAt(j));  
                    }
                    

               }
               if (obj.length() > obj1.length()) {
                obj1.setLength(0);
                obj1.append(obj);
            }
        }
        System.out.println(obj1.toString());
    }
}
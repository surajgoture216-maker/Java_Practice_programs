import java.util.*;
class tofind
{Stack<Character> st=new Stack<>();
    boolean check(String var)
    {
 for(int i=0;i<var.length();i++)
        {
            if(var.charAt(i)=='{'||var.charAt(i)=='('||var.charAt(i)=='[')
            {   char z=var.charAt(i);
                st.push(z);
            }
            else if(var.charAt(i)=='}')
           {   
                if(st.pop()!='{') 
                    return false;
                else
                 continue;
            }
            else if(var.charAt(i)==']')
        {
                if(st.pop()=='[')
                  continue;
                else
                  return false;
            }
            else if(var.charAt(i)==')')
        {
                if(st.pop()=='(')
                  continue;
                else
                 return false;
            }
        }
        return true;
    }
}
public class braces {
    public static void main(String[] args) {
        String var="{}[]({})";
        tofind obj=new tofind();
        boolean x=obj.check(var);
       System.out.println(x);
    }
}

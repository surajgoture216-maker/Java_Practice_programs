import java.util.*;
public class StackExample {
    public static void main(String a[])
    {
        Stack<Integer> st=new Stack<>();
        ArrayList arr=new ArrayList();
        arr.addAll(Arrays.asList("2","3","+","4","*","3","-"));
        Stack stack=new Stack();
        ArrayList<String> operators=new ArrayList<>();
        operators.addAll(Arrays.asList("+","-","*","/"));
        int k,l,m=0;
        for(int i=0;i<arr.size();i++)
           {
                if(operators.contains(arr.get(i)))
                {
                    String opr=String.valueOf(arr.get(i));
                    switch(opr)
                    {
                      case "+": k=st.pop();
                                l=st.pop();
                               st.push(k+l);
                               break;
                      case "-": k=st.pop();
                                l=st.pop();
                               st.push(k-l);
                               break;
                      case "*": k=st.pop();
                                l=st.pop();
                               st.push(k*l);
                               break;
                      case "/": k=st.pop();
                                l=st.pop();
                               st.push(k+l);
                               break;
                    }
                }
                else 
                { 
                    String s=String.valueOf(arr.get(i));
                    m=Integer.parseInt(s);
                    st.push(m);
                }
           }
           System.out.println(st.peek());
        }
}

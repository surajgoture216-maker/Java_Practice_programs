package CollectionFramework;
import java.util.*;
public class stackinjava {
    public static void main(String a[])
    {
        Stack st=new Stack();
        ///stcak is an a speacial ds in java which works on  Lifo principle
        /// it also contains all collrction ,list interface methods
        /// amnd also able to use all vectore methods 
        /// its also from java 1.0
        st.addElement(57);
        ///it contains some more specipic methods  that is  present in only stack
        /// those are below
        st.push(46);
        st.push(45);
        st.push(44);
        st.push(43);
        st.pop();
        st.peek();
        st.search(34);
        st.empty();

    }
}

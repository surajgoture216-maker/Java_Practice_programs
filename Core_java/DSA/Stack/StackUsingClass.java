package DSA.Stack;
import java.util.*;
public class StackUsingClass {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(34);
        s1.push(23);
        s1.push(34);
        s1.push(23);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.isEmpty());
        for (Object i : s1) {
            System.out.println(i);
        }
    }
}

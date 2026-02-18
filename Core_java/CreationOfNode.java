
import java.util.*;
import java.lang.*;
 class Node
{
   private int data;
   private Node next;
    public Node(int data,Node nx)
    {
        this.data=data;
        this.next=nx;
    }
    public int getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
    public void setData(int data)
    {
        this.data=data;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }

}
public class CreationOfNode {
    public static void main(String[] args) {
        Node x=new Node(23,null);
        Node y=new Node(34,null);
        System.out.println(x.getData());
        x.setNext(y);
        System.out.println(x.getNext());
        System.out.println(x.getNext().getData());
    }
}

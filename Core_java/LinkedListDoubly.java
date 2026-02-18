import java.util.*;
public class LinkedListDoubly {
    class Node{
        Node prev;
        int data;
        Node next;
        Node(int data)
        {
          this.prev=null;
          this.data=data;
          this.next=null;
        }
    }
    Node head=null;
    Node last=null;
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=last=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addLast(int data)
    {
     Node newNode=new Node(data);
     if(head==null)
     {
        head=newNode;
        return;
     }
     Node current=head;
     while(current.next!=null)
     {
        current=current.next;
     }
     newNode.prev=current;
     current.next=newNode;
     current=newNode;
    }
    public void printListForward()
    {
        Node current=head;
        while(current.next!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);
    }
    public void printListBackward()
    {
        Node current=head;
        while(current.next!=null)
          current=current.next;
        while(current.prev!=null)
        {
        System.out.println(current.data);
        current=current.prev;
        }
        System.out.println(head.data);
    }
    public static void main(String a[])
    {
       LinkedListDoubly obj=new LinkedListDoubly();
       obj.addFirst(80);
       obj.addFirst(10);
       obj.addFirst(20);
       obj.addLast(30);
       obj.addLast(50);
       System.out.println("forward List");
       obj.printListForward();
       System.out.println("BackWard List");
       obj.printListBackward();
    }
}

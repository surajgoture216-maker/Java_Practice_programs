import java.util.*;
public class LinkedListCirculer {
    class Node{
        Node prev;
        int data;
        Node next;
     public Node(int data)
    {
    this.data=data;
    this.next=null;
    this.prev=null;
    }
}    Node head=null;
     Node last=null;
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            last=newNode;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        newNode.prev=last;
        head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            last=newNode;
            return;
        }
        newNode.next=head;
        last.next=newNode;
        newNode.prev=last;
        last=newNode;
        head.prev=last;
    }
    public void displayForward()
    {
        Node current=head;
        while(current.next!=head)
        {
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(last.data);
    }
    public void displayBackward()
    {
        Node current=last;
        while(current.prev!=last)
        {
            System.out.println(current.data);
            current=current.prev;
        }
        System.out.println(head.data);
    }
    public void peek()
    {
        System.out.println(last.data);
    }

    public static void main(String a[])
    {
        LinkedListCirculer obj=new LinkedListCirculer();
        obj.addFirst(20);
        obj.addLast(30);
        obj.addFirst(10);
        obj.addLast(40);
        obj.displayForward();
        obj.displayBackward();
        obj.peek();
    }
}

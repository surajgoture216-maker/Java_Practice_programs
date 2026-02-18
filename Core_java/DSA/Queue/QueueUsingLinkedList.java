package DSA.Queue;
import java.util.*;
class node
{
    int data;
    node next;
    public node(int data)
    {
        this.data=data;
    }
}
class operation
{
    node front=null;
    node rear=null;
    int i=0;
    void enqueue(int data)
    {
      if(i>4)
        System.out.println("queue is full");
      else
      {
        node newnode=new node(data);
        newnode.data=data;
        if(rear==null)
        {   i++;
            rear=front=newnode;
            System.out.println("enqueued"+newnode.data);
        }
        else{
            i++;
            rear.next=newnode;
            rear=newnode;
            System.out.println("enqueued"+newnode.data);
        }
      }

    }
    void dequeue()
    {
      if(rear==null)
        System.out.println("queue is empty");
      else if(rear==front){
        System.out.println("removed "+rear.data);
        rear=front=null;
        i=0;
      }
      else{
        i--;
        System.out.println("removed"+front.data);
        front=front.next;
    }}
    void peek()
    {
       System.out.println("peek is"+front.data);
    }
    void display()
    {
     if(rear==null)
        System.out.println("queue is empty");
    else
    {  node temp=front;
        do{
        System.out.println(temp.data);
        temp=temp.next;
        }while(temp!=rear);
      System.out.println(rear.data);
    }
    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        operation obj=new operation();
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(8);
        obj.enqueue(6);
        obj.dequeue();
        obj.enqueue(7);
        obj.peek();
        obj.display();
    }
}

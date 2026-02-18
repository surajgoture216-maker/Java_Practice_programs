package DSA.Queue;
import java.util.*;
class operations
{ 
  int arr[]=new int[10];
  int front=-1;
  int rear=-1;
  void enqueue(int data)
  { if(rear-front>3)
      System.out.println("queue is full");
    else{
    if(rear==-1)
    {
      front=0;
      arr[++rear]=data;
      System.out.println("enqueued "+arr[rear]);
    }
    else
    {
      arr[++rear]=data;
      System.out.println("enqueued "+arr[rear]);
    }
  }
  }
  void dequeue()
  {  
    if(rear==-1)
      System.out.println("queue is empty");
    else if(rear==front)
    {
       System.out.println(arr[front]+"removed");
       front=rear=-1;
    }
    else
    System.out.println(arr[front++]+"removed");
  }
  void peek()
  {
    System.out.println("peek is"+arr[front]);
  }
  void display()
  {
    if(rear<0)
    {
      System.out.println("queue is empty");
    }
    else{
    int temp=front;
    while(temp!=rear)
    {
      System.out.println(arr[temp++]);
    }
    System.out.println(arr[rear]);
  }
  }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        operations obj=new operations();
        obj.enqueue(13);
        obj.enqueue(14);
        obj.enqueue(12);
        obj.enqueue(13);
        obj.peek();
        obj.enqueue(14);
        obj.enqueue(12);
        obj.dequeue();
        obj.enqueue(15);
        obj.display();
        for(int i=0;i<6;i++)
          obj.dequeue();
        
    }
}

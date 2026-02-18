import java.util.*;
class node
{
  int data;
  node next;
  node prev;
  public node(int data)
  {
    this.prev=null;
    this.data=data;
    this.next=null;
  }
}
class linked
{
  node head=null;
  node tail=null;
  void addLast(int data)
  {
    node newnode=new node(data);
    newnode.data=data;
    if(head==null&& tail==null)
    {
      head=tail=newnode;
    }
    else
    { 
      newnode.prev=tail;
      tail.next=newnode;
      tail=newnode;
      tail.next=head; 
    }
  }
  void addFirst(int data)
  {
    node newnode=new node(data);
    newnode.data=data;
    if(head==null&& tail==null)
    {
      head=tail=newnode;
    }
    else
    { head.prev=newnode;
      newnode.next=head;
      head=newnode;
      tail.next=head; 
    }
  }
  void displayForward()
  {
   node temp=head;
   do
   {
    System.out.println(temp.data);
    temp=temp.next;
  }while(temp.next!=head);
  System.out.println(tail.data);
}
void displaybackward()
{
  node temp=tail;
  while(temp.prev!=null)
  {
    System.out.println(temp.data);
    temp=temp.prev;
  }
  System.out.println(head.data);
}
}
public class circulerlinkedlist
{
  public static void main(String[] args) {
    linked obj=new linked();
    obj.addFirst(3);
    obj.addFirst(33);
    obj.addLast(34);
    obj.displayForward();
    System.out.println();
    obj.displaybackward();
  }
}

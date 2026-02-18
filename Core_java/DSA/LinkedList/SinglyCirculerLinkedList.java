package DSA.LinkedList;
import java.lang.*;
import java.util.*;
class node
{
     int data;
     node next;
    public  node(int data)
    {
        this.data=data;
        // this.next=null;
    }
}
class linkedlist
{
  node head=null;
  node tail=null;
  void addFirst(int data)
  {
     if(head==null && tail==null)
       {
        node newnode=new node(data);
        newnode.data=data;
        newnode.next=null;
        tail=head=newnode;
       }
     else
     {
        node newnode=new node(data);
        newnode.data=data;
        newnode.next=head;
        head=newnode;
     }
  }
  void delete(int value)
  {
   node temp=head;
    int count=1;
    while(count<=value)
    {
      if(count==value-1)
      {
       temp.next=temp.next.next;
      }
      temp=temp.next;
      count++;
    }
  }
 void  addLast(int data)
    {   
       if(head==null && tail==null)
       {
        node newnode=new node(data);
        newnode.data=data;
        newnode.next=null;
        tail=head=newnode;
       }
       else{
        node newnode=new node(data);
        newnode.data=data;
        newnode.next=head;
        tail.next=newnode;
        tail=newnode;
       }
    }
void display()
    {
       node temp=head;
        System.out.println();
        while(temp.next!=null)
        {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
}
public class SinglyCirculerLinkedList
{
     public static void main(String[] args) {
        linkedlist obj=new linkedlist();
        obj.addLast(45);
        obj.addLast(55);
        obj.addFirst(65);
        obj.addFirst(75);
        obj.addLast(85);
        obj.display();
        obj.delete(2);
        obj.display();
    }

}



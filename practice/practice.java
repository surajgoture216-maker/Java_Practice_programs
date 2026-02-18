import java.util.*;
class node
{
    int data;
    node previous;
    node next;
    public node(int data)
    {
        this.data=data;
        this.next=null;
        this.previous=null;
    }
}
class likedlist
{
    node head=null;
    node temp=null;
    node tail=null;
    void addFirst(int data)
    {
        if(head==null)
        {
            node newnode=new node(data);
            newnode.data=data;
            newnode.next=null;
            newnode.previous=null;
            head=temp=newnode;
            
        }
        else
        { 
            node newnode=new node(data);
            newnode.data=data;
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }
    }
    void addLast(int data)
    { 
        if(head==null)
        {
            node newnode=new node(data);
            newnode.data=data;
            newnode.next=null;
            newnode.previous=null;
            head=newnode;
            temp=newnode;
        }
        else{
            node newnode=new node(data);
            newnode.data=data;
            temp.next=newnode;
            newnode.previous=temp;
            temp=newnode;
        }
    }
    void displaybackward()
    {   
        tail=temp;
        System.out.println();
        while(tail.previous!=null)
        {
            System.out.println(tail.data+",");
            tail=tail.previous;
        }
        System.out.println(tail.data);
    }
    void display()
    {   
        
        tail=head;
        System.out.println();
        while(tail.next!=null)
        {
            System.out.print(tail.data+",");
            tail=tail.next;
        }
        System.out.print(tail.data);
    }
    
}
public class practice {
    public static void main(String[] args) {
        likedlist obj=new likedlist();
        obj.addFirst(34);
        obj.addLast(345);
        obj.addFirst(43);
        obj.displaybackward();
        obj.display();
    }
}



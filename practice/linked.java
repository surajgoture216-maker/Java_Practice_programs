import java.util.*;
class node
{
    int data;
    node next;
    public node(int node)
    {
        this.data=data;
        this.next=null;
    }
}
class linkedlist
{
    node head=null;
    node tail;
    int n=5;
    int i=0;
    void add(int data){
        if(head==null && tail==null)
        {
        node newnode=new node(data);
        i++;
        newnode.data=data;
        newnode.next=null;
        head=tail=newnode;
        }
        else{
            if(tail.next==head)
            {

            }
            if(i>=n-1)
            {   
                node newnode=new node(data);
                i++;
                newnode.data=data;
                newnode.next=head;
                head=head.next;
                tail=newnode;
            }
            else{
            node newnode=new node(data);
            i++;
            newnode.data=data;
            tail.next=newnode;
            tail=newnode;}
        }
    }
    void display()
    {
        node temp=head;
        while(temp!=tail)
        {
          System.out.println(temp.data);
          temp=temp.next;
        }
    }
}
public class linked {
    public static void main(String[] args) {
        linkedlist obj=new linkedlist();
      
    obj.add(2);
    obj.add(3);
    obj.add(4);
    obj.add(5);
    obj.add(6);
    obj.display();
    }
}



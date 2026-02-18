package DSA.Stack;

class node
{
    int data;
    node next;
    node prev;
    public node(int data)
    {
        this.data=data;
    }
}
class stack
{   
    node head=null;
    node peak=null;
    int n=5;
    int i=0;
    void push(int data)
    { 
      if(i<5)
       {
       node  newnode =new node(data);
       i++;
       if(peak==null)
       {
        newnode.data=data;
        peak=newnode;
        head=newnode;
       }
       else
       {
        newnode.data=data;
        newnode.prev=peak;
        peak.next=newnode;
        peak=newnode;
       }
    }
    else{
        System.out.println("Stack is full");}
}
    void peak()
    {
        System.out.println(peak.data);
    }
    void pop()
    {  if(peak==null)
        System.out.println("stack is empty");
       else{
       System.out.println("removed"+peak.data);
       peak= peak.prev;
       peak.next=null;
       i--;
       }
    }
    void display()
    {  
        if(peak==null)
            System.out.println("stack is empty");
        else{
        node temp=head;
        while(temp.next!=null)
        {
         System.out.println(temp.data);
         temp=temp.next;
        }
        System.out.println(temp.data);
        }
    }

}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        stack obj=new stack();
        obj.display();
        obj.push(34);
        obj.push(2);
        obj.push(34);
        obj.push(45);
        obj.display();
        System.out.println();
        obj.push(46);
        obj.peak();
        obj.push(99);
        obj.push(100);
        obj.peak();
        obj.pop();
        obj.push(90);
        obj.display();
    }
}

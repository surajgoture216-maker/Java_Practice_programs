public class LinkedListsingly {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void addFirst(int value)
    {
        Node newNode=new Node(value);
        if(head==null)
        {
            head=newNode;
            return;
        }
         newNode.next=head;
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
        current.next=newNode;
    }
    public void deleteFirst()
    {   
        head=head.next;
    }
    public void deleteLast()
    {
        if(head==null){
        System.out.println("list is empty");
        return;
        }
        if(head.next==null){
        head=null;
        return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null)
        {
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public void printlist()
    {
        Node current=head;
        while(current.next!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data+"\n\n");
        
    }
    public static void main(String a[])
    {    LinkedListsingly obj=new LinkedListsingly();
            obj.addFirst(10);
            obj.addLast(29);
            obj.addFirst(38);
            obj.addFirst(8);
            obj.addFirst(34);
            obj.addFirst(3);

            obj.printlist();
            obj.deleteFirst();
            obj.printlist();
            obj.deleteLast();
            obj.printlist();
    }
}

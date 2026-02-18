package DSA.Stack;
class stack
{ 
    int arr[]=new int[10];
    int peak=-1;
    int n=6;
    int i=0;
    void push(int data)
    { //-1 because peak is starting with -1 and ends on 4
      if(i>n)
        System.out.println("the stack is full");
      else
      {
        arr[i++]=data;
        peak++;
      }
    }
    void pop()
    {
      if(peak==-1)
        System.out.println("the stack is empty");
      else
        peak--;
    }
    void peak()
    {
        System.out.println(arr[peak]);
    }
    void display()
    {
     if(peak==-1)
            System.out.println("stack is empty");
    else{
     for(int i=0;i<=peak;i++)
        System.out.print(arr[i]+",");
    }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        stack obj=new stack();
        obj.display();
        obj.push(2);
        obj.push(34);
        obj.push(45);
        obj.peak();
        obj.display();
        System.out.println();
        obj.pop();
        obj.push(46);
        obj.push(34);
        obj.push(56);
        obj.push(99);
        obj.push(67);
        obj.display();
    }
}

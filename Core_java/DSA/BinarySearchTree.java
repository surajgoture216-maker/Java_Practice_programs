package DSA;
import java.util.*;
class node
{
    int data;
    node left;
    node right;
    public node(int data)
    {
        this.data=data;
    }
}
class createnode
{
    node root=null;
    void insert(int data)
    {
        if(root==null)
        {
          node newnode=new node(data);
          root=newnode;
          newnode.data=data;
        }
        else 
        {
            node newnode=new node(data);
            newnode.data=data;
            node temp=root;
            while(temp.left!=null|| temp.right!=null)
            {   
                if(temp.data>newnode.data)
                temp=temp.left;
                else if(temp.data<newnode.data)
                temp=temp.right;
            }
            if(newnode.data<temp.data)
            {
                temp.left=newnode;
                temp.data=newnode.data;
            }
            else if(newnode.data>temp.data)
            {
                temp.right=newnode;
                temp.data=data;
            }
        }
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        
    }
}

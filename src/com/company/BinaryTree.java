package com.company;

public class BinaryTree {
    static Node root=null;
    void insert(int data)
    {   Node newNode=new Node(data);
        Node temp=root;
        Node parent=null;
        if(root==null) {
            root = newNode;
        }
        else{
        while(true)
        {
            parent=temp;
            if(data<temp.data)
            {
                temp=temp.left;
                if (temp==null)
                {parent.left=newNode;
                return;}
            }
            else
                {
                temp=temp.right;
                if (temp==null){
                    parent.right=newNode;
                    return;
                }
            }
        }
        }
    }
    void print(Node node)
    {
     if(node!=null)
     {
       print(node.left);
         System.out.println("Data is: "+node.data);
         print(node.right);
     }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(4);
        binaryTree.insert(99);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.print(root);

    }

}
class Node
{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

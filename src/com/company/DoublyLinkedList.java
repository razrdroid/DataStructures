package com.company;

public class DoublyLinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        Node tail;
        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void insertAtFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        newNode.tail=null;
        if (head!=null)
            head.tail=newNode;
        head=newNode;
    }
    void insertAtPostion(int pos,int data)
    {   int i=1;
        Node aage=null;
        Node peeche=head;
        Node newNode=new Node(data);
        while(i!=pos-1)
        {
            peeche=peeche.next;
        }
        aage=peeche.next;
        newNode.next=peeche.next;
        newNode.tail=peeche;
        peeche.next=newNode;
        if(aage!=null)
            aage.tail=newNode;
    }
    void insertAtLast(int data)
    {
     Node newNode=new Node(data);
     if(head==null){
        newNode.tail=null;
        head=newNode;
        return;
     }
     Node t=head;
     while(t.next!=null){
         t=t.next;
     }
     t.next=newNode;
     newNode.tail=t;
     newNode.next=null;
    }
    public void print(){
        Node tnode=head;
        while (tnode!=null){
            System.out.println(tnode.data+" ");
            tnode=tnode.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.insertAtFirst(5);
        doublyLinkedList.insertAtFirst(6);
        doublyLinkedList.insertAtFirst(7);
        doublyLinkedList.insertAtFirst(8);
        doublyLinkedList.insertAtPostion(2,100);
        doublyLinkedList.insertAtLast(54);
        doublyLinkedList.print();
    }
}

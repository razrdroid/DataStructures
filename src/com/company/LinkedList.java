package com.company;

class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void push(int data)
    {  Node newNode=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void insertAtPosition(int pos,int data){
        Node traverse;
        Node prev=head;
        int i=1;
        Node insert=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        while(i!=pos-1){
            prev=prev.next;
            i++;
        }
        traverse=prev.next;
        prev.next=insert;
        insert.next=traverse;

    }
    void append(int data){
        Node newNode=new Node(data);
        Node traverse=head;
        if (head==null)
            head=newNode;
        while (traverse.next!=null){
            traverse=traverse.next;
        }
        traverse.next=newNode;
        newNode.next=null;
    }
    void deleteKey(int key)
    { Node front=head;
    Node prev=null;
    if(front!=null&&front.data==key)
    {
        head=front.next;
        return;
    }
    while(front!=null&&front.data!=key){
        prev=front;
        front=front.next;
    }
    if (front==null)
        return;
    prev.next=front.next;
    }
    void deleteAtPosition(int pos)
    {Node front=null;
    int i=1;
    Node prev=head;
    if(pos==1)
    {
        head=front.next;
        return;
    }
    while(i!=pos-1){
        prev=prev.next;
    }
    front=prev.next.next;
    prev.next=front;

    }
    void printNode(){
        Node traverse=head;
        if(head==null)
            System.out.println("no bulshit!!!");
        while(traverse!=null)
        {
            System.out.println(traverse.data);
            traverse=traverse.next;

        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.printNode();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.insertAtPosition(2,9);
        list.append(45);
        list.append(455);
        list.append(415);
        list.deleteKey(45);
        list.deleteAtPosition(2);
        list.printNode();
    }
}

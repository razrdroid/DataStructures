package com.company;

public class Queues {
    static int maxSize=3;
    static int[] a=new int[maxSize];
    int head=-1;
    int tail=-1;
    void enqueue(int data)
    {
        if(tail==-1&&head==-1){
            head=0;
            tail=0;
            a[tail]=data;
        }
        else if(head!=0&&tail==maxSize-1){
            tail=0;
            a[tail]=data;
        }
        else {
            a[++tail] = data;
        }
        System.out.println("Enqueued item: "+data);


    }

    void dequeue()
    {          System.out.println("item to be pop is: "+a[head]);
        if(head==maxSize-1){
            head=0;
        }
        else {
            head++;
        }
    }
    int peek()
    {
        return a[head];
    }
    public static void main(String[] args) {
        System.out.println("Queue programm");
        Queues queues=new Queues();
        queues.enqueue(50);
        queues.enqueue(5);
        queues.dequeue();
        queues.dequeue();
        queues.enqueue(90);
        queues.enqueue(11);
        queues.dequeue();
        queues.enqueue(44);
        queues.dequeue();
        queues.dequeue();
        queues.enqueue(9);
        queues.enqueue(4);
        queues.enqueue(1);
        queues.dequeue();
        System.out.println("Peek value: "+queues.peek());
        for (int b:
                a) {
            System.out.println("Array is"+b);
        }
    }
}

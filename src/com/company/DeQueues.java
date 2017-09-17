package com.company;

public class DeQueues {
    static int maxSize = 5;
    int tail = -1;
    int head = -1;
    static int[] arr = new int[maxSize];

    void insertRight(int data) {
        if (tail == -1 && head == -1) {
            tail = 0;
            head = 0;
            arr[tail] = data;
            System.out.println("item inserted right"+arr[tail]);
        } else {
            arr[++tail] = data;
            System.out.println("item inserted right"+arr[tail]);
        }
    }

    void insertLeft(int data) {
        if (tail == -1 && head == -1) {
            tail = 0;
            head = 0;
            arr[head] = data;
            System.out.println("item inserted left"+arr[head]);
        } else if (head == 0) {
            head = maxSize - 1;
            arr[head] = data;
            System.out.println("item inserted left"+arr[head]);
        } else {
            arr[--head] = data;
            System.out.println("item inserted left"+arr[head]);
        }
    }

    void deleteRight() {
        if (tail == -1) {
            return;
        } else {
            System.out.println("Item popped is \t" + arr[tail]);
            tail--;
        }
    }
    void deleteLeft(){
        if(head==0){
            System.out.println("Item popped is \t" + arr[head]);
            head=maxSize-1;
        }
        else {
            if(head==maxSize-1){
                System.out.println("Item popped is \t" + arr[head]);
                head=0;
            }
            else {
                System.out.println("Item popped is \t" + arr[head]);
                head++;
            }
        }
    }

    public static void main(String[] args) {
        DeQueues deQueues=new DeQueues();
        deQueues.insertLeft(5);
        deQueues.insertLeft(6);
        deQueues.insertLeft(7);
        deQueues.insertRight(4);
        deQueues.deleteLeft();
        deQueues.deleteLeft();
        deQueues.deleteLeft();
        deQueues.insertRight(3);
        deQueues.deleteRight();
        deQueues.insertRight(2);
        for (int b:arr) {
            System.out.println(b);
        }
    }
}

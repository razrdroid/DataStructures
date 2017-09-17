package com.company;

public class Stack {
    int maxSize=20;
    int a[]=new int[maxSize];
    int top=-1;
    void push(int x)
    {
     if(top>=maxSize)
     {
         System.out.println("Stack is overflow");
         return;
     }
     else{
         a[++top]=x;
         System.out.println(x+" pushed to stack");
     }
    }
    int pop(){
        if(top<0)
        {
            System.out.println("stack is underflow");
            return 0;
        }
        else {int x=a[top--];
            System.out.println("top item is "+a[top]);
        return x;}
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(7);
        s.push(8);
        System.out.println(s.pop()+" popped out");
        s.push(8);
        s.push(9);
        s.push(55);
        System.out.println(s.pop()+" popped out");
    }
}

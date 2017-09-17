package com.company;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        int a[]=new int[5];
        int minIndex=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array");
        for (int i = 0; i <5 ; i++) {
           a[i]=sc.nextInt();
        }
        for (int i = 0; i <4 ; i++) {
            minIndex=i;
            for (int j = i+1; j <5 ; j++) {
                if (a[j]<a[minIndex])
                    minIndex=j;
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(a[i]);
        }
    }
}

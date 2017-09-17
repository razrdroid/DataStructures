package com.company;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("enter element");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j = 0; j <n-1 ; j++) {
                if (a[j+1]<a[j]){
                    int swap=a[j+1];
                    a[j+1]=a[j];
                    a[j]=swap;
//                    System.out.print(a[j+1]);
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(a[i]);
        }
    }
}

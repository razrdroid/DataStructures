package com.company;
import java.util.*;
public class SelectionSortRecursion {
    void recur(int[] arr,int start,int end)
    {   if(start>=end)
        return;
        int min=minimum(arr,start,end);
        int temp=arr[start];
        arr[start]=arr[min];
        arr[min]=temp;
        recur(arr,start+1,end);

    }
    int minimum(int[] arr,int start,int end)
    {
        int temp=start;
        for (int i = start+1; i < end; i++) {
            if (arr[i]<arr[temp])
            {
                temp=i;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        SelectionSortRecursion selectionSortRecursion =new SelectionSortRecursion();
        selectionSortRecursion.recur(a,0,n);
        for (int b:
             a) {
            System.out.println(b);
        }
    }
}

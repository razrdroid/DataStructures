package com.company;
import java.util.*;
public class GcdRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the nos. whose " +
                "GCD is to be calculated");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        GcdRecursion gcdRecursion=new GcdRecursion();
        int c=gcdRecursion.Result(a,b);
        int lcm=(a*b)/c;
        System.out.println("Lcm is: "+lcm);
        System.out.println("Hcf is: "+c);

    }
    int Result(int a,int b)
    {
        if(b==0)
            return a;
        return Result(b,a%b);
    }
}

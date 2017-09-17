package com.company;
import java.math.BigInteger;
import java.util.*;
public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the digit whose factorial is to be calculated");
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        FactorialRecursion factorialRecursion=new FactorialRecursion();
        if(a>20){
            System.out.println(factorialRecursion.FactRecur(a));
        }
        else
        System.out.println(factorialRecursion.Fact(a));

    }
    public BigInteger FactRecur(long a){
        BigInteger b=BigInteger.ONE;
        for (; a >1 ; a--) {
            b=b.multiply(BigInteger.valueOf(a));
        }
        return b;
    }
    public long Fact(long a)
    {
     if(a==0)
         return 1;
     else
         return a*Fact(a-1);
    }
}

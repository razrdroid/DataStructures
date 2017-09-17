package com.company;

public class LcmHcm {

    public static void main(String[] args) {
	// write your code here
        int a=88,b=44,lcm=0;
        int m=a,n=b;
        int r=1;
        while(r!=0){
            r=m%n;
            if(r==0)
                continue;
            else{
                m=n;
                n=r;
            }
        }
        lcm=(a*b)/n;
        System.out.println("GCD is "+n+" and LCM is "+lcm);
    }
}

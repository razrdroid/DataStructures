package com.company;

public class TowerOfHanoi {
    void move(int n,char from,char to,char aux)
    {   if(n==1){
        System.out.println("Moving Disk 1 from "+from+" to "+to);
        return;
    }
        move(n-1,from,aux,to);
        System.out.println("Moving Disk "+n+" from "+from+" to "+to);
        move(n-1,aux,to,from);
    }

    public static void main(String[] args) {
        TowerOfHanoi tower=new TowerOfHanoi();
        tower.move(3,'a','c','b');
    }
}

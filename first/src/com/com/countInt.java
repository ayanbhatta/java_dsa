package com.com;

import java.util.Scanner;

public class countInt {
    public static void main(String[] args) {
        int n = 12233453;
        int count =0;
        while (n>0){
            int rem=n%10;
            if(rem==2){//no. of time 2 is repeated
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

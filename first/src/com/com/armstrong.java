package com.com;

public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int rem = 0;
        int sum=0;
        while(n>0){
            rem=n%10;
            int cube=rem*rem*rem;
            sum+=cube;
            n=n/10;
        }
        System.out.println(sum);
    }
}

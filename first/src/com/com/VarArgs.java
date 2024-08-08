package com.com;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,22,3,4,4);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

package com.com;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //creating variable to pass in the function
        int[][] Arr = new int[3][2];
        TwoDArr(Arr);//calling the twoD method
    }
    public static void TwoDArr(int[][] Arr) {
        Scanner sc = new Scanner(System.in);
        //Input
        for (int row = 0; row < Arr.length; row++) {
            for (int col = 0; col < Arr[row].length; col++) {   //Arr[row].length = takes the size of the particular row
                Arr[row][col] = sc.nextInt();
            }
        }
        //output
//        for (int row = 0; row < Arr.length; row++) {
//            for (int col = 0; col <Arr[row].length ; col++) {
//                System.out.print(Arr[row][col]+" ");
//            }
//            //To get matrix display
//            System.out.println();


//        for (int row = 0; row < Arr.length; row++) {        //using Arrays library
//            System.out.println(Arrays.toString(Arr[row]));
//        }

        //enhanced for loop
        for(int[] a: Arr){
            System.out.println(Arrays.toString(a));         //here a itself is an Array of row {0,1,2} individually
        }
    }
}


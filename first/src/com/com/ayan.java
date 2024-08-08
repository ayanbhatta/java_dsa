package com.com;

import java.util.Arrays;
import java.util.Scanner;
//use while loop when you don't know how many times you need to run the loop
//use do-while when you need to execute code for one time
public class ayan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]arr ={
                {1,2},{22,34,12},{2},{23,42}
        };
   //     for (int row = 0; row <arr.length ; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();

 //       }
        //ARRAYS LIBRARY
//        for (int row = 0; row <arr.length ; row++){
//            System.out.println(Arrays.toString(arr[row]));
//
//    }
        System.out.println("Tulika");
        int[] a = {22,32,42,52,26};
        //swap(a,1,4);
        //System.out.println(Arrays.toString(a));
        //System.out.println(maxRangeArr(a,1,3));
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }
    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
    static int maxRangeArr(int[] a,int start,int end){
        int maxVal=a[0];
        for (int i = start; i <=end ; i++) {
            if(a[i]>maxVal){
                maxVal=a[i];
            }
        }return maxVal;
    }
    static  void reverseArray(int[] a){         //two pointer method
         int start = 0;
         int end = a.length-1;
         while(start<end){
             swap(a,start,end);
             start++;
             end--;
         }
    }
}












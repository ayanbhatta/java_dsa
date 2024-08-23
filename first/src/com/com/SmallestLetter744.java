package com.com;

public class SmallestLetter744 {
    public static void main(String[] args) {
        char[] arr={'a','c','d','f','h'};
        char target='h';
        System.out.println(smallestLetter(arr,target));
    }
    static char smallestLetter(char[] arr, char target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(target<arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }return arr[start% arr.length];   //for returning the 0th index we can also write if(start==arr.length) return arr[0]
    }
}

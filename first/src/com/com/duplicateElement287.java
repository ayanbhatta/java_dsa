package com.com;

public class duplicateElement287 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4};
        int duplicate= findDuplicate(arr);
        System.out.println(duplicate);
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i<arr.length){
            if(arr[i]!=i+1){
                int correct = arr[i]-1;
                if(arr[i] !=arr[correct] && arr[i]<arr.length){      //sorting in single iteration(swap until first element is in the correct position
                    swap(arr,i,correct);
                }else return arr[i];
            }else i++;
        }return -1;
    }
    static void swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


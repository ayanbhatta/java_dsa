package DSA;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        //when given numbers from range 1,N => use Cyclic Sort
        //LOGIC => index = value - 1
        int[] arr= {2,3,1,4,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwiceDuplicate442 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static List<Integer> findDuplicate(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] !=arr[correct]){      //sorting in single iteration(swap until first element is in the correct position
                swap(arr,i,correct);
            }else{
                i++;
            }
        }List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }return ans;
    }
    static void swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

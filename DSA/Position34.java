package DSA;

import java.util.Arrays;

public class Position34 {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,8,10};
        int target=7;
        int[] ans=position(arr,target);
        System.out.println(Arrays.toString(ans));
    }
//    static int[] position1(int[] arr,int target){
//        int start=-1;
//        int end=-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==target){
//                start=arr[i];
//                break;}
//        }
//        for (int j = arr.length-1; j >0 ; j--) {
//
//            if(arr[j]==target){
//                end=arr[j];
//                break;}
//        }return new int[]{start,end};
//    }
    static int[] position(int[] arr,int target){
        int[] ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
     static int search(int[] arr,int target,boolean findFirstIndex){
        int ans=-1;
         int start=0;
         int end=arr.length-1;
         while(start<=end){
             int mid= start + (end-start)/2;
             if(target<arr[mid]){
                 end=mid-1;
             }
             else if(target>arr[mid]){
                 start=mid+1;
             }
             else{
                 ans=mid;
                 if(findFirstIndex){
                     end=mid - 1;
                 }else{
                     start = mid + 1;
                 }
             }
         }return ans;
     }
}

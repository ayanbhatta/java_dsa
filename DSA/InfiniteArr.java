package DSA;

public class InfiniteArr {
    public static void main(String[] args) {
        //start with box size 2
    }
    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid= start+ (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target==arr[mid]){
                return target;
            }
        }return -1;
    }
}

package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5,6};
        int target=4;
        int ans=binarySearch(arr,target);
        int ansC=celling(arr,target);
        int ansF=floor(arr,target);
        System.out.println(ans);
        System.out.println(ansC);
        System.out.println(ansF);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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

    static int celling(int[] arr,int target){       //returns the smallest no. greater than target-->when while loop condition is over ans will be start
        if(target> arr[arr.length-1]) return -1;
        int start=0;
        int end=arr.length-1;
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
        }return start;
    }
    static int floor(int[] arr,int target){         //returns the largest value less than the target-->when while condition is over end will be the answer
        int start=0;
        int end=arr.length-1;
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
        }return end;
    }
}

package DSA;

public class EvenNoDigit {
    public static void main(String[] args) {
        int[] num={18,124,9,1764,98,1};
        System.out.println(findNum(num));
    }
    static int findNum(int[] num){
        int count=0;
        for(int i:num){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numOfDigit=digit(num);
        if(numOfDigit % 2 ==0){
            return true;
        }
        return false;
    }
    static int digit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}

import java.util.*;
public class prime{
    // public static int prime(int n){
    //     for(int i=2; i<n; i++){
    //         if(n%i==0){
    //             System.out.println("not prime");
    //             break;
    //         }
    //         else{
    //             System.out.println(n+" is prime");
    //             break;
    //         }
    //     }
    //     return n;
    // }
    // public static void main(String[] args){
    //     Scanner sc= new Scanner(System.in);
    //     System.out.print("Enter the no : ");
    //     int n=sc.nextInt();
    //     System.out.println(prime(n));
    // }





    //OPTIMISED METHOD
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n){
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        primesInRange(20);
    }
}
import java.util.*;
public class basicJava{
    public static void main(String[] args){
        System.out.println("Enter your  nos : ");
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a : ");
        int a =sc.nextInt();
        System.out.print("Enter b : ");
        int b =sc.nextInt();
        System.out.print("Enter c : ");
        int c =sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is largest number");
        }
        else if(b>=c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
import java.util.Scanner;

public class terminaryOperator{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no. : ");
        num=sc.nextInt();
        String type =((num%2)==0) ? "even" : "odd";
        System.out.println(type);
    }
}

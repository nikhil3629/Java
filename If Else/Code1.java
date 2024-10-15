import java.util.Scanner;

public class Code1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if(x%7 == 0){
            System.out.println("divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }
}
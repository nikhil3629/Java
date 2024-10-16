import java.util.Scanner;
public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1: ");
        int x = sc.nextInt();
        System.out.println("Enter num 2: ");
        int y = sc.nextInt();
        if(x>y){
            System.out.println("x is greater");
        }else{
            System.out.println("y is greater");
        }

    }
}

import java.util.Scanner;
public class Code9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    
}

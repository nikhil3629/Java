import java.util.Scanner;
public class Code5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if(x%3 == 0){
            System.out.println("Multiple of 3");
        }else{
            System.out.println("Not Multiple of 3");
        }
    }
    
}

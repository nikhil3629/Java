import java.util.Scanner;
public class two {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int x = sc.nextInt();
        int y = 7;
        if(x%y == 0){
            System.out.println("Divisible");
        }else{
            System.out.println("not Divisible");
        }
        

    }
    
}

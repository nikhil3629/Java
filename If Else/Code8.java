import java.util.Scanner;
public class Code8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int x = sc.nextInt();
        if(x>99 && x<1000){
            System.out.println("3 digit number");
        }else{
            System.out.println("Not 3 digit number");
        }
    }
    
}

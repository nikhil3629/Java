import java.util.Scanner;
public class Code24 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int x = sc.nextInt();
        if(x>=18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not eligible for Vote");
        }
        
     }    
}

import java.util.Scanner;
public class Code22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int x = sc.nextInt();
        if(x%4 == 0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
    
}

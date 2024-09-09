import java.util.Scanner;
public class Code55 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=5; i++){
            System.out.println("Enter num:");
            int x = sc.nextInt();
            if(x%2 == 0){
                System.out.println("Even num is: "+x); 
            }
        }
    }
    
}

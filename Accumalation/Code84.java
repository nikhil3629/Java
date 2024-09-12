import java.util.Scanner;
public class Code84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
            int x = sc.nextInt();
            int sum = 0;
            int max = 0;

            while(x>0){
                int rem = x%10;
                if(max<rem){
                    max=rem;
                }
                x=x/10;
            }
            System.out.println(max);
        
    }
    
}

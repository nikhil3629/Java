import java.util.Scanner;
public class Code82 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int x = sc.nextInt();
        int sum = 0;
        while(x>0){
            int rem = x%10;
            if(rem != 0){
                sum=sum*10+rem;
            }
            x=x/10;
        }
        System.out.println(sum);
        
    }
}

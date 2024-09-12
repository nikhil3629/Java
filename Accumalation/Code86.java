import java.util.Scanner;

public class Code86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int x =sc.nextInt();
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev*10+rem;
            x=x/10;
        }
        System.out.println(rev);

    }
    
}

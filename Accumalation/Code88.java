import java.util.Scanner;

public class Code88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int x = sc.nextInt();
        int sum = 0;
        while(x>0){
            int rem = x%2;
            sum=sum*10+rem;
            x=x/2;
        }
        int r = 0;
        while(sum>0){
            int rr = sum%10;
            r=r*10+rr;
            sum=sum/10;
        }
        System.out.println(r);
    }
    
}

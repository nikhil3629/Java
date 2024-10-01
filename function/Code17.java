import java.util.Scanner;

public class Code17 {
    static boolean armstrong(int a){
        int b = a;
        // int mul = 1;
        int sum =0;
        while(a>0){
            int rem = a%10;
            sum=sum+rem*rem*rem;
            a=a/10;
        }
        // System.out.println(sum);
        if(b == sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x = sc.nextInt();
        boolean y = armstrong(x);
        System.out.println(y);
        
    }
    
}

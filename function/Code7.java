import java.util.Scanner;

public class Code7 {
    static boolean palindrome(int a){
        int sum = 0;
        int b = a;
        while(a>0){
            int rem = a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        // System.out.println(sum);
        // System.out.println(b);
        if(sum == b){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        boolean y = palindrome(x);
        System.out.println(y);
    }
    
}

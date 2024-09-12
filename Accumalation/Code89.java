import java.util.Scanner;
public class Code89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int x = sc.nextInt();
        int y = x;
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(y == rev){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }
    }
}

import java.util.Scanner;
public class Code78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sum = 0;
        for(int i =1; i<=5; i++){
            int x = sc.nextInt();
            sum=sum+x;
        }
        System.out.println(sum);
    }
    
}

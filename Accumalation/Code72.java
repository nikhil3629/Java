import java.util.Scanner;

public class Code72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int q = 1;
        for(int i=1; i<=r; i++){
            q=q*n;
        }
        System.out.println(q);
    }
    
}

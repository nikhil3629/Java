import java.util.Scanner;
public class Code21 {
    static int cube(int a){
        int b = a*a*a;
        return b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int x = sc.nextInt();
        int y = cube(x);
        System.out.println(y);
    }
    
}

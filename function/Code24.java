import java.util.Scanner;
public class Code24{
    static void Check(int a){
        if(a%2 == 0){
           System.out.println("even");
        }else{
           System.out.println("odd");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int x = sc.nextInt();
        Check(x);
    }
}

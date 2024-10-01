import java.util.Scanner;

public class Code8 {

    static int county(int a){
        int sum = 0;
        int count = 0;
        while(a>0){
            int rem = a%10;
            sum=sum*10+rem;
            count++;
            a=a/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int x = sc.nextInt();
        int y= county(x);
        System.out.println(y);
    }
}

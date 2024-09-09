import java.util.Scanner;
public class Code59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num:");
        int x = sc.nextInt();
        int count = 0;
        while(x>0){
            int rem = (x%10);
            count=count+1;
            if(count == 2){
                System.out.println(rem);
            }
            x=(x/10);
            

        }
    }
}

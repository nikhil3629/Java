import java.util.Scanner;
public class Code81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int x = sc.nextInt();
        int count = 0;
        while(x>0){
            int rem = x%10;
            if(rem == 1){
                count++;
            }
            x=x/10;
        }
        System.out.println("Count of 1 is:"+count);
    }
}

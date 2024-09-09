import java.util.Scanner;

public class Code61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while(x>0){
            int rem = (x%10);
            count=count+1;
            if(count == 4){
                System.out.println(rem);
            }
            x=(x/10);
        }
    }
    
}

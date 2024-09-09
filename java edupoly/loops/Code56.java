import java.util.Scanner;
public class Code56 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // int rem;
        while(x>0){
            int rem = (x%10);
            System.out.println(rem);
            x=x/10;
        }
    }
    
}

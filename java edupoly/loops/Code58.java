import java.util.Scanner;
public class Code58 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x>0){
            int rem = x%10;
             if(rem%2 != 0){
                System.out.println(rem);
            }
            x=x/10;
        }
    }
}


import java.util.Scanner;

public class Code87 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum=0;
        int k =0;
        while(x>0){
            int rem = x%2;
            sum=sum*10+rem;
            x=x/2;

        }
        System.out.println(sum);
        while(sum>0){    //111001
            int r = sum%10;
            k=k*10+r;
            sum=sum/10;
        }
        System.out.println(k);
    }
}

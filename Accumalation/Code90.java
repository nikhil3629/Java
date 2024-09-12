import java.util.Scanner;
public class Code90 {
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enteer a num: ");
            int x = sc.nextInt();
            int y = x;
            int sum = 0;
            while(x>0){
                int rem = x%10;
                sum = sum+rem*rem*rem;
                x=x/10;
            }
            System.out.println(sum);
            if(y == sum){
                System.out.println("Armstrong number");
            }else{
                System.out.println("Not armstrong number");
            }
        }
    
}

/*153 1^3 5^3 3^3  addition */
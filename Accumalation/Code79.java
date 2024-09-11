import java.util.Scanner;
public class Code79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int sum = 0;
        int average;
        for(int i=1; i<=5; i++){
            int x = sc.nextInt();
            sum=sum+i;
        }
        average=(sum/5);
        System.out.println("average is: "+average);
    }
    
}

import java.util.Scanner;

public class Code6 {
    static boolean prime(int a){
        int count = 0;
        int count1 = 2;
        for(int i = 1; i<=a; i++){
            if(a%i == 0){
                count++;
            }
        }
        if(count == count1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x =sc.nextInt();
        boolean y = prime(x);
        System.out.println(y);
    }
    
}

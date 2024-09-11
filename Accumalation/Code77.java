import java.util.Scanner;
public class Code77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x = sc.nextInt();
        int count = 0;
        int count1 =2;
        for(int i = 1; i<=x; i++){
            if(x%i == 0){
                count++;
            }
        }
        if(count == count1){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }

    }
    
}

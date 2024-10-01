import java.util.Scanner;

public class Code9 {
    static void between(int a, int b){
        for(int i = a; i<=b; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        //  between(1,20);
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter a number: ");
        int y = sc.nextInt();
        between(x,y);
        
    }
    
}

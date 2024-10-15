import java.util.Scanner;
public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int x = sc.nextInt();
        if(84%x == 0){
            System.out.println("Factor");
        }else{
            System.out.println("Not factor");
        }

    }
    
}

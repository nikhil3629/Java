import java.util.Scanner;
public class Code73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int x = sc.nextInt();
        int p=1;
        for(int i=x; i>0; i--){
            p=p*i;
            
        }
        System.out.println(p);
    }
    
}

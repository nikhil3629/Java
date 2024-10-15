import java.util.Scanner;
public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int x = sc.nextInt();
        if(96%x == 0 && x<=96){
            System.out.println("Factor and valid");
        }else{
            System.out.println("Not Factor and not valid ");
        }
    }
    
}

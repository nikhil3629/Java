import java.util.Scanner;
public class lv8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String name:");
        String s = sc.nextLine();
        for(int i = 0; i<=s.length()-1; i++){
            System.out.println(s.charAt(i));
        }
    }
    
}

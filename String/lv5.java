import java.util.Scanner;
public class lv5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value:");
        String s = sc.nextLine();
        System.out.println(s.charAt(s.length()-1));
    }
    
}

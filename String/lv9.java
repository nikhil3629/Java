import java.util.Scanner;
public class lv9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Name: ");
        String s = sc.nextLine();
        for(int i=0; i<=s.length()-1; i=i+2){
            System.out.println(s.charAt(i));
        }
    }
    
}

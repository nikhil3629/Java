import java.util.Scanner;
public class lv12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("enter a character: ");
        char c = sc.next().charAt(0);
        for(int i = 0; i<=s.length()-1; i++){
            if(s.charAt(i) == c){
                System.out.println("position index is: "+i);
            }
        }
    }
    
}

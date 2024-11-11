import java.util.Scanner;
public class lv16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = "";
        for(int i = s.length()-1; i>=0; i--){
            n=n+s.charAt(i);
        }
        if(s.equals(n)){
           System.out.println("it is palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
    }
    
}

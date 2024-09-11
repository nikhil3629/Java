import java.util.Scanner;
public class Code75 {
    public static void main(String[] args) {
        int x = 24;
        int count=0;
        for(int i =1; i<=24; i++){
            if(x%i == 0){
                 count++;
            }
        }
        System.out.println(count);
    }
    
}

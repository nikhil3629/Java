import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] ar = {23,34,54,10,34,7,23,10,34};
        int count = 0;
        for(int i = 0; i<ar.length; i++){
            if(ar[i] == x){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}

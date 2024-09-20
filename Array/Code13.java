import java.util.Scanner;
public class Code13 {
    public static void main(String[] args) {
        int[] ar = {23,34,54,10,4,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int x = sc.nextInt();
        for(int i = 0; i<ar.length; i++){
            if(ar[i]>x){
              System.out.println("numbers greater than x are:"+ar[i]);
            }
        }
        
    } 
    
}

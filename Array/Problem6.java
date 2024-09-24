import java.util.Scanner;
public class Problem6 {
     public static void main(String[] args) {
        int[] ar = {10,15,24,29,12,18,5,9,2,58,44,55};
        int[] br =new int[ar.length];
        int[] cr =new int[ar.length];
        for(int i = 0; i<=ar.length-1; i++){
            br[i] = ar[i];
            cr[i] = ar[i];
            if(br[i]%2 == 0){
                System.out.println("even numbers:"+br[i]);
            }
            if(cr[i]%2 != 0){
                System.out.println("Odd numbers:"+cr[i]);
            }
        }
     }
}

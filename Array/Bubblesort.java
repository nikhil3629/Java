import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        int[] ar = {1,7,5,8,2,9,3};
        int temp;
       
        for(int k = 0; k<=ar.length-1; k++){

            for(int i=0; i<=ar.length-2;i++){
           
                if(ar[i]>ar[i+1]){
                     temp = ar[i];
                     ar[i] =ar[i+1];
                     ar[i+1] = temp;
                }
         }
                
            }
       
        for(int j = 0; j<=ar.length-1; j++){
            System.out.println(ar[j]);
        }
    }
    
}

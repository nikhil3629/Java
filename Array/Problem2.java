import java.util.Scanner;
public class Problem2 {
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter a number");
           int x = sc.nextInt();
           int y = x;
           int sum = 0;
           for(int i = 1; i<x; i++){
            if(x%i == 0){
                sum = sum+i;
            }
         }
         System.out.println(y);
         System.out.println(sum);
         if(sum == y){
            System.out.println(x+"is a perfect number");
         }else{
            System.out.println(x+" is not a perfect number");
         }
    }
}

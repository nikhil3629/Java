import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 99999;
        for(int i = 1; i<=5; i++){
            int x = sc.nextInt();
            if(max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    
}

import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a num: ");
      int x = sc.nextInt();
      int y =x;
      int sum = 0;
      
      while(x>0){
        int rem = x%10;
        int mul = 1;
        for(int i=rem; i>=1; i--){
             mul=mul*i;
        }
             sum=sum+mul;
             x=x/10;
      }
      System.out.println(sum);
      if(sum == y){
        System.out.println("It is a Strong number");
      }else{
        System.out.println("it is not a Strong number");
      }
    }
    
}

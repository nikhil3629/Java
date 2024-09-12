import java.util.Scanner;
public class Code91 {
    public static void main(String[] args) {
        int a = 0;
        int b =1;
      for(int i =0; i<10; i++){
            int c = a;
             a=b;        
             b=a+c; 
             if(c == 21){
                break;
             }    
            System.out.println(c);
      }
     
    }
    
}

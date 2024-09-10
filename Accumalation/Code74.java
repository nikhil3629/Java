import java.util.Scanner;
public class Code74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = (x-y);
        int n = 1;
        int r = 1;
        int nr = 1;
        for(int i = x; i>0; i--){
            n=n*i;
        }
        for(int j=y; j>0; j--){
            r=r*j;
        }
        
        for(int k=z; k>0; k--){
            nr=nr*k;
        }
        int ncr = ((n)/((nr)*(r)));
        System.out.println(n);
        System.out.println(r);
        System.out.println(nr);
        System.out.println(ncr);
        
       
        
    }
}

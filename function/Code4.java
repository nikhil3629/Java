public class Code4 {
    static int fact( int a){
        int b = 1;
        for(int i =a; i>=1; i--){
            b=b*i;
        }
        return b;
    }
    public static void main(String args[]){
        int factorial = fact(4);
        System.out.println(factorial);
    }
    
}

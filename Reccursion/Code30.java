public class Code30 {
    static int power(int a, int b){
        if(b == 0){
            return 1;
        }else{
            return a*power(a,b-1);
        }
    }
    public static void main(String args[]){
        int x = power(10,4);
        System.out.println(x);
    }
    
}

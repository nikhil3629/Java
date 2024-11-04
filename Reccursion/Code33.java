public class Code33 {
    static int ab(int a, int b){
        if(a == b){
            return 10;
        }else{
            return a+ab(a+1,b);
        }
    }

    public static void main(String args[]){
        int x = ab(1,10);
        System.out.println(x);
    }
    
}

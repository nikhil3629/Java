public class power {
    static int nk(int a, int b){
        if(b == 0){
            return 1;
        }else{
            return a*nk(a,b-1);
        }
    }
    public static void main(String args[]){
        int x = nk(3,5);
        System.out.println(x);

    }
    
}

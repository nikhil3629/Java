public class Code37 {
    static int addi(int a, int sum){
        if(a == 0){
            return sum;
        }else{
            int rem = a%10;
            sum = sum+rem;
            return addi(a/10,sum);


        }
    }
    public static void main(String args[]){
        int x = addi(145,0);
        System.out.println(x);
    }
    
}

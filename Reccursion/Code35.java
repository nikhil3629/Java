public class Code35 {
    static int reverse(int a, int rev){
        if(a == 0){
            return rev;
        }else{
            int rem = a%10;
            rev = rev*10+rem;
            return reverse((a/10),rev);
        }
    }
        
    public static void main(String args[]){
        int x = reverse(145,0);
        System.out.println(x);
    }
    
}

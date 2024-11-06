public class Code36 {
    static int palindrome(int a,int b){
        if(a == 0){
            return b;
        }else{
            int rem = a%10;
            b=b*10+rem;
            return palindrome(a/10,b);
        }
    }
    public static void main(String args[]){
        int n = 121;
        int x = palindrome(n,0);
        System.out.println(x);
        if(x == n){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        
    }
    
}

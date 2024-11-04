public class Code34 {
    static int addition(int a, int b,int sum){
        if(a > b){
            return sum;
        }
        if(a%2 == 0){
           sum=sum+a;
        }
        return addition(a+1,b,sum);
    }
    public static void main(String args[]){
        int x = addition(10,20,0);
        System.out.println(x);
    }
    
}

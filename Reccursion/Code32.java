public class Code32 {
    static void abc(int a, int b){
        if(a<=b){
            if(a%2 == 0){
                System.out.println(a);
            }
            abc(a+1,b);
        }

    }
    public static void main(String args[]){
        abc(20,35);
    }
    
}

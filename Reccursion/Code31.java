public class Code31 {
    static void abc(int a, int b){
        if(a<=b){
            System.out.println(a);
            abc(a+1,b);
        }
    }
    public static void main(String args[]){
        abc(1,50);
    }
    
}

public class sum {
    static int abc(int a){
        if(a == 1){
            return 1;
        }else{
            return a+abc(a-1);
        }
    }
    public static void main(String arg[]){
        int x = abc(10);
        System.out.println(x);
    }
    
}

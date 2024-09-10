public class Code71 {
    public static void main(String[] args) {
        int p = 1;
        for(int i = 1; i<=10; i++){
            if(i%2 != 0){
                p=p*i;
            }
        }
        System.out.println(p);
    }
    
}

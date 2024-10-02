public class Code26 {
    static void interval(int a, int b){
          for(int i = a; i<=b; i++){
            int count1 = 0;
            int count2 = 2;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    count1++;
                }
            }
            if(count1 == count2){
                System.out.println(i);
            }
          }
    }
    public static void main(String[] args) {
        interval(1,10);
    
        
    }
}

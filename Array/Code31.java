public class Code31 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<ar.length; i++){
            if(ar[i]%3 ==0 || ar[i]%5 == 0){
                System.out.println(ar[i]);
            }
        }
    }
    
}

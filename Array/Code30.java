public class Code30 {
    public static void main(String[] args) {
        int[] ar = {2,3,6,12,5,7,18};
        for(int i = 0; i< ar.length; i++){
            if(ar[i]%2==0 && ar[i]%3==0){
                System.out.println(ar[i]);
            }
        }
    }
    
}

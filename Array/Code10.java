public class Code10 {
    public static void main(String[] args) {
        int[] ar = {23,34,54,10,4,7};
        int max = ar[0];
        for(int i = 0; i<ar.length; i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
        System.out.println(max);
    }
    
}

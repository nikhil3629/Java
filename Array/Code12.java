public class Code12 {
    public static void main(String args[]){
        int[] ar = {23,34,54,10,4,7};
        int sum = 0;
        
        for(int i = 0; i<ar.length; i++){
            sum=sum+ar[i];
        }
        int average= (sum/ar.length);
        System.out.println(average);
    }
    
}

public class Code08 {
    public static void main(String[] args) {
        int[][] ar = {{10,14,4},{20,5,2},{3,9,11}};
        int max = ar[2][1];
        for(int i=0; i<=ar.length-1; i++){
           if(max<ar[2][i]){
            max=ar[2][i];
           }
        }
        System.out.println(max);
    }
    
}

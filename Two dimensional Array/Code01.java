public class Code01{
    public static void main(String[] args) {
        int[][] ar = {{10,14,4},{20,5,2},{3,9,11}};
        int sum = 0;
        for(int i=0; i<=ar.length-1; i++){
            sum=sum+ar[0][i];
           
        }
        System.out.println(sum);
   }
}
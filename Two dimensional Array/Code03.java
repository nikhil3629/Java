public class Code03 {
    public static void main(String[] args) {
        int[][] ar={{10,14,4},{20,5,2},{3,9,11}};
        int sum = 0;
        for(int i = 0; i<=ar.length-1; i++){
            for(int j =2; j<=2; j++){
                sum = sum+ ar[i][2];
            }
        }
        System.out.println(sum);
    }
    
}

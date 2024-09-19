public class Code9 {
    public static void main(String[] args) {
        int[] ar = {23,34,54,10,4,7};
        int min=ar[0];
        for(int i = 0; i<=ar.length-1; i++){
            if(min>ar[i]){
                min=ar[i];
            }
        }
        System.out.println(min);
    }
}

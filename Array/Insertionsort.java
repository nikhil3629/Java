
public class Insertionsort {
    public static void main(String[] args) {
        int[] ar = {4,3,2,10,12,1,5,6};
        int temp;
        int k;
        for(int i=1; i<=ar.length-1; i++){
            temp = ar[i];
            for(k = i; k>0; k--){
                if(temp<ar[k-1]){
                    ar[k] = ar[k-1];
                }
                else
                {
                    break;
                }
            }
            ar[k] =temp;
        }
        
        for(int j = 0; j<=ar.length-1; j++){
            System.out.println(ar[j]);
        }

    }
}

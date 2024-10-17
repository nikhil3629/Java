public class Cl1secondmaxwithbubblesort{
    public static void main(String[] args) {
        int[] ar = {7,5,1,4,8,3,6};
        int temp;
        for(int k = 0; k<=ar.length-1; k++){
            for(int i =0; i<=ar.length-2; i++){
                if(ar[i] > ar[i+1]){             
                   temp = ar[i];
                   ar[i] = ar[i+1];
                   ar[i+1] = temp;
                }
            }
        }
        // for(int j = 0; j<=ar.length-1; j++){
            System.out.println(ar[ar.length-2]);
        // }
       
    }
}
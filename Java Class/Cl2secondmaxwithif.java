public class Cl2secondmaxwithif {
    public static void main(String args[]){
        int[] ar = {15,3,4,7,8,9};
        int max = ar[0];
        int smax =ar[0];
        for(int i = 1; i<=ar.length-1; i++){
            if(max<ar[i]){
                smax=max;
                max=ar[i];
            }
           else{
            if(smax == max || smax<ar[i]){
                smax=ar[i];
            }
           }
        }
        System.out.println(max);
        System.out.println(smax);
    }
    
}

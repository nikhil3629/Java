public class Secondmaxbybubblesort {
    public static void main(String[] args) {
        int[] ar = {1,5,7,8,4,9};
        int temp;
        for(int k =0; k<=ar.length-1; k++){
            for(int i=0; i<=ar.length-2; i++){
                if(ar[i]>ar[i+1]){
                  temp=ar[i];
                  ar[i]=ar[i+1];
                  ar[i+1]=temp;
                }
          }
        }
         System.out.println(ar[ar.length-1]);
         System.out.println(ar[ar.length-2]);
        
    }
    
}

public class Selectionsort {
    public static void main(String args[]){
        int[] ar = {64,25,12,22,11};
        
        for(int i =0; i<=ar.length-2; i++){
            int min=ar[i];
            
           for(int k=i+1; k<=ar.length-1; k++){
                   if(min>ar[k]){
                     min=ar[k];
                  } 
           }
           int temp = min;
           min = ar[i];
           ar[i] = temp;
        }
        for(int j = 0; j<=ar.length-1; j++){
            System.out.println(ar[j]);
        }

    }
}

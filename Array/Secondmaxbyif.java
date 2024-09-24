public class Secondmaxbyif {
    public static void main (String args[]){
        int[] ar = {1,5,8,2,7,9,6};
        int max=ar[0];
        int smax=ar[0];
        for(int i=0; i<=ar.length-1; i++){
            if(max<ar[i]){
                smax=max;
                max=ar[i];
            }else{
                   if(smax == max || smax<ar[i]){
                    smax=ar[i];
                    }
            }
            
        } 
        System.out.println(max);
        System.out.println(smax);
    }
    
}

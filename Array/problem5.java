public class problem5 {
    public static void main(String args[]){
        int[] ar = {20,10,5,15,25,30};
        int y = 35;

        for(int i =0; i<=ar.length-2; i++){
            for(int k = i+1; k<=ar.length-1;k++){
                if(ar[i]+ ar[k] == y){
                       System.out.println(ar[i]+","+ar[k]);
                }
            }
        }
       
       
        
    }
    
}




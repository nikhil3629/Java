public class Sascending {
    public static void main(String args[]){
        String s = "nikhil";
        int[] ar = new int[s.length()];
        for(byte i = 0; i<=s.length()-1; i++){
            int x = 0;
            char c = s.charAt(i);
            x = (int)c;
            ar[i] = x;
            // System.out.println(x);
            // System.out.println(ar[i]);
        }
        int temp;
        for(int k = 0; k<=ar.length-1; k++){
            for(int i = 0; i<=ar.length-2; i++){
                if(ar[i]>ar[i+1]){
                    temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
    
                }

            }
       
        }
        for(int j = 0; j<=ar.length-1; j++){
            System.out.println(ar[j]);
        }

        char []c =  new char[s.length()];
        for(int y=0; y<=ar.length-1; y++){
            char z = (char)ar[y];
            System.out.println(ar[y]);
        }
        
          
        
    }
    
}

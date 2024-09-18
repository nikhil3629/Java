public class p2 {
    public static void main(String args[]){
        for(int i=1; i<=7; i++){
            for(int j=7;j>=i; j--){
                if(i%3 == 0){
                   System.out.print("$ "); 
                }
                if(i%3 == 1){
                    System.out.print("# ");
                }
                if(i%3 == 2){
                    System.out.print(j+" ");
                }
            }
            System.out.println(" ");
        }
    }
}

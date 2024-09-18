public class p3 {
    public static void main(String args[]){
        for(int i=2; i<=8; i++){
            for(int k = 7; k>=i; k--){
                System.out.print(" ");
            }
            for(int j = 2; j<=i; j++){
                if(i%2 == 1){
                    System.out.print("#");
                }else{
                    System.out.print(i);
                }

            }
            System.out.println(" ");
        }
    }
}

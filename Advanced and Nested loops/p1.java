public class p1 {
    public static void main(String args[]){
        for(int i =1; i<=7; i++){
            for(int j=1; j<=i; j++){
                if(i%2 == 0){
                    System.out.print("#");
                }else{
                    System.out.print(i);
                }
                
            }
            System.out.println(" ");
        }
    }
    
}

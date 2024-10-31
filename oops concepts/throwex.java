public class throwex {
    public static void main(String args[]){
        try {
            int a = 120000000;
            int b = 150000000;
            int c = a*b;
            if(c<0){
                throw new Exception();

            }else{
                System.out.println(c);
            }
            
            

        } catch (Exception e) {
            System.out.println("Arthimetic operation failed");
        }
    }
    
}

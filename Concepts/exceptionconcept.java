public class exceptionconcept {
    public static void main(String args[]){
        int a = 155555555;
        int b = 555555555;
        int c = a*b;
        try {
            if(c<0){
                try {
                    // throw = new ArithmeticException();
                    
                } catch (Exception ArthimeticException ) {
                    System.out.println("arthimetic operation is failed");
                }

            }else{
                System.out.println(c);
            }
            
        } catch (Exception arthimeticoperation) {
            System.out.println("operation is failed");
        }
        
    }
    
}

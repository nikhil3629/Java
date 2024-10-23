public class Exceptionhandling6 {
    public static void main(String args[]){
        try {
            try {
               int a = 1999999999;
               int b = 1999999999;
               int c = a*b;
               if(c<0){
                throw new ArithmeticException();
               }else{
                System.out.println(c);
               }
               
            } catch (ArithmeticException e) {
               System.out.println("Arthimetic error");
           
           }
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("out of bond");
       }
       catch(Exception e){
           System.out.println("exception");
       }
   }
}
    


public class Exceptionhandling5 {
    public static void main(String args[]){
        try {
             try {
                int a = 1999999999;
                int b = 1999999999;
                int c = a*b;
                System.out.println(c);
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

/*In this java Cannot find error and compilation cannot find error and runtime cannot find error.
 * to solve this we have one solution in java and it was written in Exceptionhandling6
 */

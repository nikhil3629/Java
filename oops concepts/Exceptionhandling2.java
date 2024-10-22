public class Exceptionhandling2 {
    public static void main(String args[]){
        try {
            int[] ar = {1,5,10};
            System.out.println(ar[5]);
            
        } catch (ArithmeticException e) {
            System.out.println("Arthimetic problem occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound occurs");
        }
        catch(Exception e){
            System.out.println("Common issue");
        }
    }
    
}
/*we should write common exception in last
 * one try can have multiple catches.
 */

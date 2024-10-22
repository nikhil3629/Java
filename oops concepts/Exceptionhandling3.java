public class Exceptionhandling3 {
    public static void main(String args[]){
        try {
            try {
                int[] ar = {1,5,10};
            System.out.println(ar[5]);
                
            } catch (ArithmeticException e) {
             System.out.println("check");
            }
            
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
/*if we write onetry in another try then that is called as nested try 
 * for every try block there should be one catch block 
*/

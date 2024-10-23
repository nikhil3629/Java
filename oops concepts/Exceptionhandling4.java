public class Exceptionhandling4 {
    public static void main(String args[]){
        try {
            try {
                int[] ar = {1,5,10};
            System.out.println(ar[1]);
            ArithmeticException e1 = new ArithmeticException();
            throw e1;
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
/*In this we can fire exception by using throw */

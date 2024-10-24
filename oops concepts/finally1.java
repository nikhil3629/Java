public class finally1 {
    public static void main(String args[]){
        try {
            int a = 20/5;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
        finally{
            System.out.println("Block of Code is executed");
        }
    }
    
}
/*finally is a block of code which is executed after the execution of try and catch statements
 * finally block in java provides closing file, closing connection.
 */

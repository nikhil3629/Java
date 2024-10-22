public class Exceptionhandling {
    public static void main(String args[]){
        try {
            System.out.println(10/0);
            
        } catch (Exception e) {
            System.out.println("check it once");
        }
        System.out.println("hello");
          
    }
}
/*Some times error occur and some times errors will not occur this is called as excption errors.
 * Abrupt shutdown means if we are writing in word doc and suddenly suddenly our system will be shutdown then it is called as abrupt.
 * For error there is no mechanism to handle in java.
 * if we didnt handle exception then total code will not run and it will get exception.
 * if we  handle exception then that line of code will not run and the correct one will execute.
 * by kepping code in try catch it will handle the exception.
 * 
 * 
*/ 
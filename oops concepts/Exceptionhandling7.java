public class Exceptionhandling7 {
    static void abc()throws Exception{
    System.out.println("Static function");
    throw new Exception();
    }
    public static void main(String args[]){
        try {
            abc();
        } catch (Exception e) {
            System.out.println("okk");
        }
    }
    
}
/*A throws clause lists the types of exceptions that a method might. */

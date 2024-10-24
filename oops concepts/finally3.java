public class finally3 {
    public static void main(String args[]){
        try {
            int x = 1/0;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
    }
    
}

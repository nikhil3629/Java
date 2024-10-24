public class finally2 {
    public static void main(String args[]){
        try {
            int x = 1/0;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Error Occured");
        }
        finally{
            System.out.println("block of code Executed");
        }
    }
    
}

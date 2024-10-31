public class tryandcatch {
    public static void main(String args[]){
        // try {
        //     String s = "nikhil";
        //     System.out.println(s);
        // } catch (Exception e) {
        //     System.out.println("problem occured");
        // }
        try {
            int[] ar = {1,5,7};
            System.out.println(ar[5]);
        } catch (Exception e) {
            System.out.println("Problem raised");
        }
    }
    
}

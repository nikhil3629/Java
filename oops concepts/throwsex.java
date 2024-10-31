public class throwsex {
    static void xyz() throws Exception{
        System.out.println("niks");
        throw new Exception();
    }
    public static void main(String args[]){
        try {
            xyz();
        } catch (Exception e) {
            System.out.println("ok");
        }

    }
    
}

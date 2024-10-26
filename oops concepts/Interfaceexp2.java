public class Interfaceexp2 {
    public static void main(String args[]){
        interface Ainterface{
            public void abc(int x);
            public void xyz(String s);
        }
        abstract class Aclass implements Ainterface{
            public void abc(int x){
                System.out.println(x);
            }
            // public void xyz(String s){
            //     System.out.println(s);
            // }
            // public void pqr(){
            //     System.out.println("This is instance method");
            // }
        }
        // Aclass oa1 = new Aclass();
        // oa1.abc(15);
        // // Aclass oa2 = new Aclass();
        // // oa2.xyz("nani");

        // Ainterface a1 = new Aclass();
        // a1.abc(10);
       

    }
}
/*if we require partial implementation of interface then we can convert the class into abstract class
 * Interfaces can be extended. which we seen in iheriance
 */

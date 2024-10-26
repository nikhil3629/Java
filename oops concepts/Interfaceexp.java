public class Interfaceexp {
    public static void main(String args[]){
        interface Ainterface{
            public void abc(int x);
            public void xyz(String s);
        }
        class Aclass implements Ainterface{
            public void abc(int x){
                System.out.println(x);
            }
            public void xyz(String s){
                System.out.println(s);
            }
            public void pqr(){
                System.out.println("This is instance method");
            }
        }
        // Aclass oa1 = new Aclass();
        // oa1.abc(15);
        // Aclass oa2 = new Aclass();
        // oa2.xyz("nani");

        Ainterface a1 = new Aclass();
        a1.xyz("niks");
        // a1.pqr();  /*it will throw error because this method is not there in parent class */
        

    }
    
}
/*Interface is nothing but a full abstract class
 * interface will have only signatures.
 * we should specify access modifiers for methods.
 * when we create a new class then the methods which are placed in interface should also be placed in new class. 
 * Every method in interface is abstract method.
 * It is fully abstract class.
 */

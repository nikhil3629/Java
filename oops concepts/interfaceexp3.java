public class interfaceexp3 {
    public static void main(String args[]){
        interface Ainterface{
            public void abc(int x);
            public void xyz(String s);
            default public void nk(){
                System.out.println("nik");
            }
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
        a1.nk();
        // a1.pqr();  /*it will throw error because this method is not there in parent class */
        

    }
}
/*we can do implementation in interface by using default access modifier.
 * private interface methods are also there in interface and this private is used to access the default methods.
 */

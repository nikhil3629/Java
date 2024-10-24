public class Finalmethod {
    public static void main(String args[]){
        class A{
           final void abc(){
                System.out.println("Niks");
            }
        }
        class B extends A{
            void abc(){
                System.out.println("niki");
               
            
            }
        }
        B ob = new B();
        ob.abc();
        

    }
    
}
/*if we define particular method as final then it cannot be override.
 * using final to prevent overriding.
 */

public class Finalclass {
    public static void main(String args[]){
        final class A{
            void abc(){
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
/* if we define particular class as final then that class cannot be inherited.
*using final to prevent inheritence.
*/

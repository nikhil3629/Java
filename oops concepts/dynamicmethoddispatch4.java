public class dynamicmethoddispatch4 {
    public static void main(String args[]){
        class A{
            int x = 100;
            void callme(){
                System.out.println("a call");
            }

        }
        class B extends A{
            int y = 200;
            void callme(){
                System.out.println("b call");
            }
        }
        class C extends A{
            void callme(){
                System.out.println("c call");
            }
        }
        A oa1;
        oa1=new B();
        oa1.callme();
        oa1 = new C();
        oa1.callme();
    }
    
}
/*In this we have same method in class B and Class C due to overridden we get output as call B and call C and this methods will be called at runtime
 * So that we call this as runtime polymorphism or overriden methods.
   */

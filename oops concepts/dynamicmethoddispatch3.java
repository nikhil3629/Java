public class dynamicmethoddispatch3 {

    public static void main(String args[]){
        class A{
            int x = 100;
            void callme(){
                System.out.println("a call");
            }

        }
        class B extends A{
            int y = 200;
            void messageme(){
                System.out.println("b call");
            }
        }
        A oa1 = new B();
        oa1.callme();
        // oa1.messageme();

    }
    
}
/*In this callme() is called and output will be "a call" and the function messageme() cannot be called by using oa1 reference.*/


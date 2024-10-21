public class dynamicmethoddispatch2 {
    public static void main(String args[]){
        class A{
            int x = 100;
            // int y = 500;
        }
        class B extends A{
            int y = 200;
        }
        A oa1 = new B();
        System.out.println(oa1.x);
        // System.out.println(oa1.y);
    }
    
}
/*In this we can get output only of Class A and we didnt get output of Class B because int y is not there in class A */

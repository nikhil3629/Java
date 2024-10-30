public class references {
    
    public static void main(String args[]){

        class A{
            int x = 100;
        }
        class B {
            int y = 200;
        }
        A oa1 = new A();
        B ob1 = new B();
        System.out.println(oa1.x);
        System.out.println(ob1.y);

    }
    
}

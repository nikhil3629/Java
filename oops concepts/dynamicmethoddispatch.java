class A{//base class
   void callme(){
   System.out.println("a call");
   }
}
class B extends A{ //derived class
   void callme(){
    System.out.println("b call");
    
   }
}
class C extends A{
    void callme(){
    System.out.println("c call");
    }
}

public class dynamicmethoddispatch {
    public static void main(String args[]){
            A a =new A();  //a is refering to object
            B b = new B();
            C c = new C();
            
            A r; // r is reference of class A

            r=a;  // r is refering class A object
            r.callme();

            r=b;
            r.callme();

            r=c;
            r.callme();
    }
    
}
/*Dynamic method dispatch is a mechanism by which a call to an overriden method is resolved at run time rather than compile time.
  *Dynamic method dispatch is nothing but dynamic method call.
 * dynamic is run time and static is compile time.
 * we can give base class reference to derived class.
*/
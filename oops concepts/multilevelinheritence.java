class A{
    int x = 300;
}
class B extends A{
    int y = 500;
}
class C extends B{ 
    int z  = 100;
}


public class multilevelinheritence {
   public static void main(String args[]){
    C ob1 = new C();
    System.out.println(ob1.z);
    System.out.println(ob1.y);
    System.out.println(ob1.x);
   }
    
}

/*acquiring properties from parent class to child class and this child class will act as parent class to another class is known as known as multilevel inheritence
 * muliple inheritence will not be applied in java.
 */

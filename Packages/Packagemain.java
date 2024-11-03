
import Apack.Aclass;
import Bpack.Bclass;
import Cpack.Cclass;
import Dpack.Dclass;

public class Packagemain {
    public static void main(String args[]){
        System.out.println("maws");
        Aclass oa1 =new Aclass();
        oa1.abc();
        Bclass ob1 = new Bclass();
        ob1.bcd();
        Cclass oc1 = new Cclass();
        oc1.cde();
        oc1.abc();
        Dclass od1 = new Dclass();
        od1.def();


    }
    
}
/*when we create a protected method and we inherit that method to other pack then we cannot access that method by creating object but,
 we can access it by using super keyword.   */

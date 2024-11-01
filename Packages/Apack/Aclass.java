package Apack;

public class Aclass {
    public void abc(){
        System.out.println("a public");
    }
    protected void ameth(){
        System.out.println("a protected");
    }
    
}
/*cd Apack
 * javac Aclass.java
 * java Aclass
 * cd ..
 * we should write method in public then onlywe can access it in main file.
 * if we do any changes in  Aclass then we should compile  Aclass again.
 */

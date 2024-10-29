class student{
    private void abc(){
       System.out.println("hello");
    }
    public void xyz(){
        abc();
    }
}
public class privateaccess {
    public static void main(String args[]){
         student n1 = new student();
         n1.xyz();
    }
    
}

/* we cannot access private access modifier directly so that we use public modifier and then we will call
 * public one by using object and when this public will be called then this public will call private one and the private one will be accessed.
 */

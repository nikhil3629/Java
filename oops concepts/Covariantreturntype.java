class students{
    public void abc(){
        System.out.println("niks");
    }
    public void xyx(){
        System.out.println("hello");
    }
}
class mem extends students{

   students eee(students x){
    return x;
   }
     
   
}

public class Covariantreturntype {
    
    public static void main(String args[]){
      
    students s1=new students();
    
    mem s2=new mem();
    s2.eee(s1.abc());

       
    }
    
}

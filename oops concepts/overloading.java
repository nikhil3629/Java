public class overloading {

    static void abc(){
        System.out.println("nikhil");
    }
    static void abc(int x){
        System.out.println("nikki");
    }
    static void abc( String s){
        System.out.println("niks");
    }
    static void abc( char a){
        System.out.println("n");
    }
   
    public static void main(String args[]){
        abc();
        abc(10);
        abc("nnnn");
        abc('n');
        
    }
    
}

/*If we define a multiple functions with  same function name then it occurs overloading.
 * overloading is a feature of polymorphism.
 * it is early binding.
 * it is static binding.
 * it is complie time polymorphism.
 * it also works based on parameter in function.
 */

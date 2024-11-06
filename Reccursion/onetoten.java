public class onetoten {
    static void num(int a){
        if(a<=10){
            System.out.println(a);
            num(a+1);
        }
    }
    public static void main(String args[]){
        num(1);
    }
    
}
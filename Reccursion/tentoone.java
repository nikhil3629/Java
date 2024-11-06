public class tentoone {
    static void nik(int a){
        if(a>=1){
            System.out.println(a);
            nik(a-1);
        }
    }
    public static void main(String args[]){
        nik(10);
    }
    
}

public class Code3 {
    static void sortnums(int a,int b, int c){
          if(a<b){
            if(a<c){
                if(b<c){
                    System.out.println(a+" "+b+" "+c);
                }else{
                    System.out.println(a+" "+c+" "+b);
                }
            }else{
                System.out.println(c+" "+a+" "+b);
            }
          }else{
            if(b<c){
                if(a<c){
                    System.out.println(b+" "+a+" "+c);
                }else{
                    System.out.println(b+" "+c+" "+a);
                }
            }else{
                System.out.println(c+" "+b+" "+a);
            }
        }
    }
    public static void main(String[] args) {
        sortnums(45,7,68);
        
    }
    
}

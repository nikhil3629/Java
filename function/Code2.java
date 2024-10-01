public class Code2 {
    static int compare (int x, int y, int z){
        if(x>y){
            if(x>z){
                return x;
            }else{
                return z;
            }
        }else{
               if(y>z){
                    return y;
                }else{
                    return z;
                }
            }
        
    }
    public static void main(String[] args) {
        int greatest = compare(45,67,23);
        System.out.println(greatest);
    }
    
}

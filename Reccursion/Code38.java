public class Code38{
    static int abc(int a){
        if(a==1){
            return 1;
        }else{
            return a*abc(a-1);
        }
    }
    public static void main(String args[]){
        int x = abc(8);
        System.out.println(x);
    }
}
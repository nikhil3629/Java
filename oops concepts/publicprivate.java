class teacher{
    public int x;
    private int y;
    int z;

    teacher(int a, int b, int c){
        this.x =a;
        this.y=b;
        this.z=c;
    
    }
}

public class publicprivate {
    public static void main(String args[]){
        teacher t1 = new teacher(100,200,50);
        System.out.println(t1.x);
        // System.out.println(t1.y);
        System.out.println(t1.z);
    }
    
}
/*In this, we can use public and private acces modifiers for properties.
 * we will get output for public one and we didn't get output for private.
 * If we didnt write any access modifiers for propety then it will be default one which is nothing but public access modifier.
  */

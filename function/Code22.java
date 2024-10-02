import java.util.Scanner;
public class Code22 {
    static int circle(int a){
        int b = a*2;
        return b;
    }
    static double cr(int c){
        double d = ((2)*(3.14)*(c));
        return d;
    }
    static double area(int e){
        double f = 3.14*e*e;
         return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius = sc.nextInt();
        int diameter = circle(radius);
        System.out.println("diameter: "+diameter);
        double circum = cr(radius);
        System.out.println("circum: "+circum);
        double ar = area(radius);
        System.out.println("area:"+ar);
    }
    
}

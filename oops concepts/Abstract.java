
    abstract class shape{
        void sk(){
            System.out.println("nikhil");
        }
        abstract void perimeter();
        abstract void area();
    }
    class circle extends shape{
           int radius=0;
           circle(int x){
            this.radius = x;
        }
        void area(){
            System.out.println(3.14*radius*radius);
        }
        void perimeter(){
            System.out.println(2*3.14*radius);
        }
    }
    class rectangle extends shape{
        int length = 0;
        int width = 0;
        rectangle(int a, int b){
            this.length = a;
            this.width = b;
        }
        void area(){
            System.out.println(length*width);
        }
        void perimeter(){
            System.out.println(2*(length+width));
        }
    }
    public class Abstract {
    public static void main(String args[]){
       
        shape s1 = new circle(10);
        s1.area();
        s1.perimeter();
        shape s2 = new rectangle(5,10);
        s2.area();
        s2.perimeter();
        

    }
    
}
/*Abstract class is a class which contain one or more abstract methods 
 * Abstract class can contain abstract and non abstract methods.
 * abstract methods must and should  implemented in child classes.
*/

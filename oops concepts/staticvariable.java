public class staticvariable {
    public static void main(String args[]){
        class student{
            int x = 100;
            static int y = 200;
        }
        student s1 = new student();
        student s2 = new student();
        s1.x++;
        s1.y++;
        System.out.println(s1.x);
        System.out.println(s2.x);
        System.out.println(s1.y);
        System.out.println(s2.y);
        System.out.println(student.y);
        
    }
    
}

/*static: if we access methods and properties by using class name then it is  called as static methods
 * static methods are also called as class variables.
 * instance methods are the one which can be accessed by using objects.
 * In static for similar values it will have one memory for objects.
 * In instance for every object it will have its own memory.
 */

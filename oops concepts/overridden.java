public class overridden {
    public static void main(String[] args) {
        class employee{
            int x = 10;
            employee(){
                System.out.println("emp is called");
            }
            void abc(){
                System.out.println("emp call");
            }
            
        }
        class teacher extends employee{
            int y = 15;
            teacher(){
                System.out.println("tea is called");
            }
            void abc(){
                System.out.println("tea call");
            }
            
        }
        teacher t1 = new teacher();
        t1.abc();
    }
}

/*if we define same function in parent class and child class then it is called as overridden. or both classes should have relation then only we can say it is overriden.
 *it is run time polymorphism.
 it is late binding.
*  when we have same function in parent class and child class then when we create object for child class then it will child class function.
*/
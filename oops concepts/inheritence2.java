public class inheritence2 {
    public static void main(String[] args) {
        class employee{
            int x = 10;
            employee(){
                System.out.println("emp is called");
            }
            
        }
        class teacher extends employee{
            int y = 15;
            teacher(){
                System.out.println("tea is called");
            }
            
        }
        teacher t1 = new teacher();
    }
    
}

/*when we create constructor function in parent and child class then if we 
create object for child class then first parent class will called and next child class will be called. */

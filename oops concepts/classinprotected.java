public class classinprotected {
    public static void main(String[] args) {
        class employee{
            int x = 10;
            employee(){
                System.out.println("emp is called");
            }
            void abc(){
                System.out.println("emp call");
            }
            protected void xyz(){
                System.out.println("emp calling");
            }
            
        }
        class teacher extends employee{
            int y = 15;
            teacher(){
                System.out.println("tea is called");
            }
            void abc(){
                System.out.println("tea call");
                super.xyz();
            }
            
        }
        teacher t1 = new teacher();
        t1.abc();
    }
}

/*when we write class in main class, then when we will give protected for parent class function
 and we call that function from child class then it will be called. */

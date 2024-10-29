public class overridden2 {
    public static void main(String[] args){
        class employee{
             employee(){
                System.out.println("employee called");
             }
             void abc(){
                System.out.println("emp call");
             }
             void xyz(){
                System.out.println("emp calling");
             }
        }
        class teacher extends employee{
            teacher(){
                System.out.println("teacher called");
            }
            void abc(){
                System.out.println("tea call");
                this.xyz();
            }
            void xyz(){
                System.out.println("tea calling");
            }
        }
        teacher ob1 = new teacher();
        ob1.abc();
    }
    
}

/*In this when the function abc is called  in child class then the function xyz()
 is also called because this function is there in function abc()
 */

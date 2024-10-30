public class superkeyword{
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
                super.xyz();
            }
            void xyz(){
                System.out.println("tea calling");
            }
        }
        teacher ob1 = new teacher();
        ob1.abc();
    }
}
/*Super keyword refers to the parent class function */

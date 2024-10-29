public class objectcount {
    public static void main(String args[]){
        class obj{
            static int count = 0;

            obj(){   /*constructor function */
                this.count++;  /*or count++; or obj.count++ */
            }

        }
        obj o1 = new obj();
        obj o2 = new obj();
        obj o3 = new obj();
        obj o4 = new obj();
        obj o5 = new obj();
        System.out.println(obj.count);
        
    }
    
}

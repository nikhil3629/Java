public class inheritence {
    public static void main(String args[]){
        class employee{
            int x = 10;
        }
        class teacher extends employee{
            int y = 3000;
        }
        teacher v1 = new teacher();
        System.out.println(v1.x);
        System.out.println(v1.y);
    }
    
}

/*acquiring properties or behavior from one class to another class is called as inheritence.
 * employee is called as parent class or base class.
 * teacher is called as derived class.
 */

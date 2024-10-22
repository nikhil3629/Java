public class employeesalary{
    public static void main(String args[]){
        class employe{
            String fullname;
            int basic;
            int hra;
            int da;
            int pf;
            double pt;

            employe(String a, int b, int c, int d, int e,double f){
                this.fullname=a;
                this.basic=b;
                this.hra=c;
                this.da=d;
                this.pf=e;
                this.pt=f;
            }
          double  getsalary(){
               return  this.basic+((double)(this.hra)/100)*this.basic+((double)(this.da)/100)*this.basic-this.pf*2+((double)(this.pt)/100)*this.basic;
            
            }
           
        }
        employe e1 = new employe("checkers",80000,70,20,2000,2);
        employe e2 = new employe("vens",90000,70,20,2500,2.5);
        employe e3 = new employe("muts",100000,70,20,3000,3);

        double one = e1.getsalary();
        double two = e2.getsalary();
        double three = e3.getsalary();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        
        
    }
}
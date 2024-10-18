public class Busticket {
    public static void main(String args[]){
        class tickets{
            String name;
            int age;
            int seatno;
            String destination;
            double baseprice;
            double buspartnergst;

            tickets(String n, int a, int s, String d, double ba, double bu  ){
                this.name =n;
                this.age=a;
                this.seatno=s;
                this.destination=d;
                this.baseprice=ba;
                this.buspartnergst=bu;

            }

            double price(){
                return this.baseprice+ this.baseprice*(this.buspartnergst/100);
            }

        }
        tickets pass1 = new tickets("Praveen",22,18,"jadcherla",800,5);
        tickets pass2 = new tickets("yeshwanth",22,10,"kurnool",900,5);
        tickets pass3 = new tickets("Pawan",23,077,"gooty",1100,5);

        double person1 = pass1.price();
        double person2 = pass2.price();
        double person3 = pass3.price();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
import java.util.Scanner;
public class queuedata {
    public static void main(String args[]){

           class queue{
                int[] ar = new int[100];
                int r;
                int l;
                int length;

                queue() {
                    this.r =0;
                    this.l = 0;
                    this.length = 5;
                }
                void enquee(int x){
                      if( r-l == length){
                         System.out.println("enquee is overflow");
                      }else{
                       this.ar[r++]=x;
                       this.display();

                      }
                }

                void dequee(){
                        if(r-l == 0){
                          System.out.println("Queue is underflow");
                        }else{
                           this.l++;
                           this.display();
                        }
                }

                void display(){
                       for(int i = l; i<=r-1; i++){
                         System.out.print(ar[i]+"\t");
                       }
                       System.out.println(" ");
                }

            
            }
                queue ar1 = new queue();
                while (true) { 
                   System.out.println("1.enquee \t 2.dequee \t 3.display \t 4.exit");
                   Scanner sc = new Scanner(System.in);
                   int a = sc.nextInt();
                   if(a == 1){
                    System.out.println("enter num to enquee:");
                    int b = sc.nextInt();
                    ar1.enquee(b);
                   }
                   if(a==2){
                    ar1.dequee();
                   }
                   if(a==3){
                    ar1.display();
                   }
                   if(a==4){
                    break;
                   }
               
                }
    }
       
}
    


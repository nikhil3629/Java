import java.util.Scanner;
public class StackData {
    public static void main(String args[]){
        class Stack{
            int[] st = new int[5];
            int tos;

            Stack(){
                this.tos =-1;
            }

            void push(int x){
                if(tos == st.length-1){
                    System.out.println("Stack Overflow");
                }else{
                    this.st[++tos]=x;
                    this.display();
                }
            }

            void pop(){
                if(tos == -1){
                    System.out.println("Stack underflow");
                }else{
                    this.tos--;
                    display();
                }
            }

            void display(){
                for(int i = 0; i<=this.tos; i++){
                    System.out.print(this.st[i]+"\t");
                }
                System.out.println();
            }

        }
        Stack s1 = new Stack();
        while(true){
            
            System.out.println("1.push() \t 2.pop() \t 3.display() \t break");
            Scanner sc = new Scanner(System.in);
            int a =sc.nextInt();
            if(a==1){
                System.out.println("Enter a num");
                int b = sc.nextInt();
                s1.push(b);
            }
            if(a==2){
                s1.pop();
            }
            if(a==3){
                s1.display();
            }
            if(a==4){
                break;
            }


        }
             

    }
}
    


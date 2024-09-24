public class Problem3 {
    public static void main(String args[]){
        for(int i=100;i<=500;i++)
        {
            int sum=0;
            int x=i;
            while(x>0)
            {
                int rem=x%10;
                sum=sum+rem;
                x=x/10;
            }
            if(sum==5)
            {
                System.out.println(i);
            }
        }
   }
}
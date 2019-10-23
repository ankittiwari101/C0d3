import java.util.*;

class Fibonnaci{
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = scan.nextInt();
        if(n==1)
            System.out.println("First term of Fibonnaci series is 0");
        else if(n==2)
            System.out.println("Second term of Fibonnaci series is 1");
        else{
            int t1=0;
            int t2=1,t3=0;
            for(int i=1;i<=n-2;i++)
            {
                t3=t1+t2;
                t1=t2;
                t2=t3;
            }
            System.out.println("The nth term of Fibonnaci series is = "+t3);
        }
    }
}

import java.util.*;

class Pattern{
    public static void draw(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = scan.nextInt();
        draw(n);
        scan.close();
        
    }
}

import java.util.*;
class PrimeNumbers
{
  public static void printPrime(int no)
  {
    boolean isPrime = true;
    for(int j=2; j<=no; j++)
    {
        isPrime = true;
        for(int i=2;i<=j/2;i++)
        {
            if(j%i==0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
          System.out.println(j);
      }
    }
    
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter positive integer :");
    int no = scan.nextInt();
    printPrime(no);
    scan.close();
  }
}


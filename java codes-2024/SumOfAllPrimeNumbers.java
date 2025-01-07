import java.util.*;
public class SumOfAllPrimeNumbers
{
    public static boolean prime(int n)
    {
        
        for(int i=2;i<=n/2;i++)
        {
        if(n%i==0)
        {
            return false;
        } 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),sum=0;
        for(int i=1;i<=n;i++)
        {
            if(prime(i))
            {
                sum+=i;
            }
        }

        System.out.println(sum);
        
    }

    
}



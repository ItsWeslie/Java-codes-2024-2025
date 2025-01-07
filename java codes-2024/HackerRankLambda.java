
import java.util.Scanner;

interface Lambda1
{
   boolean isOdd(int num);
}

interface Lambda2
{
    boolean isPrime(int num);
}

interface Lambda3
{
    boolean isPalindrome(int num);
}

public class HackerRankLambda {
    public static void main(String[] args) 
    {
        Lambda1  odd = (num) -> 
        {
            if(num%2==1) 
            return true;  
            else
            return false;
        };

        Lambda2 prime = (num) ->
        {
           int i=2;
            while (i<=num/2) 
            {
            if(num%i==0)
            {
                return false;   
            }                
            }
            return true;
        };  
        
        
        Lambda3 palind = (num) ->
        {
            int r=0,origi;
            origi=num;
            r=r*10+num%10;
            if(origi==r)
            return true;
            else
            return false;
        };

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ");

    }
}

import java.util.Scanner;

public class PalindromeOfAddingToNumber 
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=s.nextInt(),sum=0,reverse=0,temp;

        while (num!=0)
        {
            sum=sum+num%10;
            num/=10; 
        }
        temp=sum;

        while (sum!=0) 
        {
          reverse=reverse*10+(sum%10);
          sum/=10;
        }
    
        if(temp==reverse)
        {
            System.out.println("1 palindrome");
        }
        else
        {
            System.out.println("0 no");
        }
    }
    
}

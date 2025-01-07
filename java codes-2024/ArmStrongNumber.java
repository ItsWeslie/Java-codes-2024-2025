import java.util.*;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt(),temp,temp2=n,count=0;
        temp=n;
        int sum=0; //armStrong=0
        while(temp>0)
        {
            temp/=10;
            count++;
        }

        while (n!=0)
        {
            //armStrong=n%10;if we need to use third variable use this or else directly use n%10 in Math.pow() function
            sum=sum+(int)(Math.pow(n%10, count));
            n=n/10;
        }
        System.out.println(temp2==sum?"armstrong":"not a armstrong");
        
    }
}

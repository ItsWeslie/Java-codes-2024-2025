import java.util.Scanner;
public class Pattern2 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,n;
        System.out.println("enter the value for n : ");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if (i==j||i+j==n+1||i==1||i==n) 
                {
                    System.out.print("* ");  
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}


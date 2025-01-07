import java.util.Scanner;

public class HackerRankIf 
{
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the value for n : ");
    int n= s.nextInt();

    if(n%2==1)
    {
        System.out.println("weird");
    }
    else if(n%2==0&&n>=2&&n<=5)
    {
        System.out.println(" not weird");

    }
    else if(n%2==0&&n>=6&&n<=20)
    {
        System.out.println(" weird");

    }
    else if(n%2==0&&n>=20)
    {
        System.out.println(" not weird");

    }

 }   
}

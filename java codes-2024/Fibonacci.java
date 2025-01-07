import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num=s.nextInt();
        int first=0,second=1,fibo;

        System.out.print(first+" ");
        System.out.print(second+" ");
        for (int i = 2; i <=num; i++) 
        {
            fibo=first+second;
            System.out.print(fibo+" ");
            first=second;
            second=fibo;
        }
    }
    
}

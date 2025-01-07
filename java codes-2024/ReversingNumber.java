
import java.util.Scanner;

public class ReversingNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : \n");
        int number = s.nextInt();
        int reverse=0;
        while (number!=0) 
        {
            
            reverse=reverse*10+(number%10);
            number/=10;
            
        }

        System.out.println(reverse);
    }
    
}

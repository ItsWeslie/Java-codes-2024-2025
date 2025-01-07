import java.util.Scanner;

public class HackerForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the table no : ");
        int n = s.nextInt();
        System.out.println();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
    
}

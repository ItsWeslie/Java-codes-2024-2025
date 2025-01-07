import java.util.Scanner;

public class Arrays {
    public static void main(String[] args)
     {
        
        int a[] = new int[50];
        Scanner s = new Scanner(System.in);
        int i;
        for(i=1;i<=3;i++)
        {
            System.out.println("enter the element : ");
            a[i]=s.nextInt();
        }
        for(i=1;i<=3;i++)
        {
        System.out.print(a[i]);
        }
    }
    
}

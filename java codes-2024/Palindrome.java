import java.util.Scanner;

public class Palindrome 
{
public static void main(String[] args) 
{
    String original, reverse = ""; 
    Scanner s = new Scanner(System.in);   
    System.out.println("Enter a string/number to check if it is a palindrome");  
    original = s.nextLine();   
    int length = original.length();   
    for ( int i = length - 1; i >= 0; i-- )  
       reverse = reverse + original.charAt(i);  
    if (original.equals(reverse))  
       System.out.println("YES");  
    else  
       System.out.println("NO");   
}    
}

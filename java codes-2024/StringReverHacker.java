import java.util.Scanner;

public class StringReverHacker {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        String str, rev="";
        char ch;
       str=s.next(); 
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        rev= ch+rev; 
      }
      if(str.equals(rev))
      {
        System.out.println("yes");
      }
      else
      System.out.println("No");
    }
    
}

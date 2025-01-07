import java.util.Scanner;

public class StringIntroHacker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        int a =A.length();
        int b =B.length();
        System.out.println(a+b);
         
        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

       String str1= A.substring(0, 1).toUpperCase();
       String str2=A.substring(1);
       String strfin1 = str1+str2;
       String str3= B.substring(0, 1).toUpperCase();
       String str4=B.substring(1);
       String strfin2 = str3+str4;
       System.out.println(strfin1+" "+strfin2);
    }
    
}

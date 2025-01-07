import java.util.Scanner;

public class MergeTwoStrings
{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String s1=s.nextLine(),s2=s.nextLine(),s3="";
    int len;
    
    if(s1.length()>=s2.length())
    {
        len=s1.length()-1;
    }
    else
    {
        len=s2.length()-1;
    }

    for(int i=0;i<=len;i++)
    {
        s3=s3+s1.charAt(i)+s2.charAt(i);
    }

    System.out.println(s3);

    //incomplete
}    
}

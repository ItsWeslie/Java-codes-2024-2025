public class StringsAndAscci 
{
public static void main(String[] args) {
    char ch='a';
   
    String s ="";

    for(int i=0;i<=26;i++)
    {
    ch=(char)('a'+ i);

    s=s+ch;
    }

    System.out.println(s);

}    
}

import java.util.Arrays;

class Palin{
    Boolean show(String str)
{
    
for(int i=0;i<=str.length()/2;i++)
{
    str=str.toLowerCase();
    char start=str.charAt(i);
    char end=str.charAt(str.length()-1-i);
    if(start!=end)
    {
        return false;
    }
}
return true;
    
}
}

public class Palindrome2 {
    public static void main(String[] args) {
        String str ="malayalam";
Palin p = new Palin();
        System.out.println(p.show(str));



    }
}

public class StringReversalUsingLoop {
    
    public static void main(String[] args) {
       String str1="welcome";
       String str2="";
       
       System.out.println(str1.charAt(str1.length()-1));
       
       for(int i=str1.length()-1;i>=0;i--)
       {
           str2+=str1.charAt(i);
       }
       
       System.out.println(str2);
    }
}
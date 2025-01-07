public class ReferenceTypeAssign {
    public static void main(String[] args) {
        String str1="hello";
        String str2=str1;

        System.out.println(str2);

        str2="hi";

        System.out.println(str1);
        System.out.println(str2);
    }
    
}

import java.util.Scanner;

public class HackerRankInOut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()) ;
        double d =Double.parseDouble(s.nextLine()) ;
        String str=s.nextLine();


        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+n);
    }
}

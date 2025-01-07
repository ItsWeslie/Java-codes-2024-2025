import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class HackerListProg {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=0;i<=n;i++)
        {
        list.add(s.nextInt());
        }

        

        int insert=s.nextInt();
        int element=s.nextInt();

        list.set(insert, element);
        
        list.remove(s.nextInt());
        
        for(int i=0;i<list.size();i++)
        {
            System.out.print( list.get(i)+" ");
        }
    }
}


import java.io.*;
import java.util.*;
interface  AdvancedArithmetic
{
   public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
     {
        int sum=0;
         for(int i=1;i<=n;i++)
         {
             if(n%i==0)
             {
             sum=sum+i;
             }
         }
       return sum;  
     }
}
public class Solution {

    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        ImplementedInterfaceNames(mc);
       System.out.println(mc. divisor_sum(6));


    }

       static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println("I implemented: "+interfaceName);
        }
    }
}
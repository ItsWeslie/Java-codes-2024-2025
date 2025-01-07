
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        
        Set values = new HashSet();

        values.add(56);
        values.add(78);
        values.add("hello");
        values.add(56);//no duplicates allowed and no index values

        for (Object e : values) {
            System.out.println(e);
        }
        System.out.println();
        

        Set<Integer> val = new HashSet<Integer>();

        val.add(1);
        val.add(16);
        val.add(18);
        val.add(20);

        for (Object ele : val) {
            System.out.println(ele);
        }
        System.out.println();
        
        
        Set<Integer> valSet = new TreeSet<Integer>();//it gives the values in the sorted order 
        
        Collection<Integer> valSet2 = new TreeSet<>();//this also possible for declaration

        

        valSet.add(7);
        valSet.add(10);
        valSet.add(15);
        valSet.add(19);

        for (Object elem : valSet) {
            System.out.println(elem);
        }


        Iterator<Integer> it = valSet.iterator();

        while (it.hasNext())//it takes all the element from the set until the elements present in the set
        {
            System.out.println(it.next());//it gives element in the set
            
        }
       


    }
}

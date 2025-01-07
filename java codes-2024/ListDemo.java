
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    
    public static void main(String[] args) {
        List l = new ArrayList<>();//here list is a super class of ArrayList,LinkedList,Vector & Stack so that we are creating List reference object by using ArrayList sub class of List

        l.add(1);
        l.add("sam weslie prabhakaran");

        System.out.println(l.get(1));
    }
}

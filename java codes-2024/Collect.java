import java.util.ArrayList;

public class Collect {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(7);
        System.out.println(a.size());
        System.out.println(a.get(0));
        System.out.println(a.remove(1));
        System.out.println(a.contains(5));
        System.out.println(a.set(0, 5));

        ArrayList al = new ArrayList();
        al.add("sam");
        al.add(7);
        al.add("stark");
        for(int i:a)
        System.out.println(i);
    }
}

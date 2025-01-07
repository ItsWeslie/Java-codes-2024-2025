
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortTheArrayWithUniqueElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> arlist = new ArrayList<>();
        System.out.println("enter the no of elements :");
        int noOfElement=s.nextInt();
        for (int i = 0; i <noOfElement; i++) {
            int temp=s.nextInt();
            if(!arlist.contains(temp))
            {
                arlist.add(temp);
            }
        }

        Collections.sort(arlist);

        System.out.println(arlist);


    }
}

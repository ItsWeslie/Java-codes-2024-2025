
import java.util.ArrayList;
import java.util.Scanner;

public class FindLeaderOfArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        
        int size=s.nextInt(), arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=s.nextInt();
        }
        ArrayList<Integer> leader = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {

                    flag = false;
                    break;
                }
            }

            if (flag) {
                leader.add(arr[i]);
            }
        }
        System.out.println(leader);

    }
}

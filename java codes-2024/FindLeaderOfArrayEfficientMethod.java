//find the leader of the array which is greater than or equal to right side of the rest  of the array element and last element in the array always the leader element in the array

import java.util.*;
public class FindLeaderOfArrayEfficientMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the size of array");
        int size=s.nextInt(), arr[] = new int[size],curr_leader;

        for (int i = 0; i <arr.length; i++) 
        {
        arr[i]=s.nextInt();    
        }

        curr_leader=arr[arr.length-1];
        list.add(curr_leader);

        for (int i = arr.length-2; i >=0; i--) 
        {
        if (arr[i]>=curr_leader) 
        {
        curr_leader=arr[i];
        list.add(curr_leader);    
        }    
        }
        Collections.reverse(list);
        System.out.println(list);
    }
    
}

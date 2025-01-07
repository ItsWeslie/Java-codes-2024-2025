
import java.util.Scanner;

public class SortArray012S{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size=s.nextInt(), arr[] = new int[size];
        System.out.println("enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=s.nextInt();
        }

        int c0=0,c1=0,c2=0;

        for (int i = 0; i <size; i++) {
            if(arr[i]==0)
                c0++;
                else if(arr[i]==1)
                c1++;
                else
                c2++;
        }

        for (int i = 0; i < c0; i++) {
            arr[i]=0;
        }

        for (int i = c0; i < c0+c1; i++) {
            arr[i]=1;
        }

        for (int i = c0+c1; i < size; i++) {
            arr[i]=2;
        }


        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
    
}

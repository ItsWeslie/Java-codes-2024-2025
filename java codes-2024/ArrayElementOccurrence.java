
import java.util.Scanner;

public class ArrayElementOccurrence
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {1,1,6,9,7},target=s.nextInt();

        System.out.println(occuranceCheck(arr,target));
    }

    static int occuranceCheck(int arr[],int target)
    {
        int count = 0;

        for(int i=0;i<arr.length;i++)
        {
            //for(int j=i+1;j<arr.length;j++)
            //{
            if(arr[i]==target)
            {
                count++;
            }
            //}
        }

        return count;
    }
}
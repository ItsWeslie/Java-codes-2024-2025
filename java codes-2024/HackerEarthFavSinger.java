import java.util.Scanner;

public class HackerEarthFavSinger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sing;
        int count=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            sing=s.nextInt();
            arr[i]=sing;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

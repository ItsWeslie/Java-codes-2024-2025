
import java.util.Scanner;

public class ZeroReplaceWithGivenNumber {

    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);

        int num = s.nextInt(),count=0,temp,d;
        temp=num;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        int arr[] = new int[count],i=count-1;

       

        while(num!=0)
        {
            d=num%10;
            num/=10;

            if(d==0)
            {
                d=5;
            } 
            arr[i--]=d;
           
        }

        for(int j : arr)
        {
            System.out.print(j+" ");
        }
    }
    
}

import java.util.Scanner;

public class KthDIgitOfTheNumByPower 
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base=s.nextInt(), noOftimes=s.nextInt(),power=1,k=s.nextInt();

        for(int i=1;i<=noOftimes;i++)
        {
            power*=base;
        }

        String pow = " "+power;

        System.out.println(pow.charAt(k));
    }
    
}

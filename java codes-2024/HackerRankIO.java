import java.util.Scanner;

public class HackerRankIO {
    public static void main(String[] args) {
       
            Scanner sc=new Scanner(System.in);
            String s1;
            int x;
            String wrd[] = new String[3];
            String arr[] = new String[3];
             String sum;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                s1=sc.next();
                x=sc.nextInt();

                wrd[i]=s1;
                sum = Integer.toString(x);
                if(sum.length()==3)
                {
                    arr[i]=""+x;
                }
                else
                {
                    arr[i]="0"+x;
                }
            }
            for(int i=0;i<3;i++)
            {
                System.out.println(wrd[i]+" "+arr[i]);
            }

            
            System.out.println("================================");

    }
}





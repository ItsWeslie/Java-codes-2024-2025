public class FibonacciWithSimpleMath {
    public static void main(String[] args) {
        int arr[]=fibo(2);

        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }

    static int[] fibo(int n)
    {
        if(n==1)
        {
            return new int[]{0};
        }
        
        int arr[] = new int[n];
        int a=0,b=1,c=0;
        arr[0]=a;
        arr[1]=b;
        
        for(int i=2;i<arr.length;i++)
        {
            c=a+b;
            arr[i]=c;
            a=b;
            b=c;
        }
        

        return arr;
    }
}

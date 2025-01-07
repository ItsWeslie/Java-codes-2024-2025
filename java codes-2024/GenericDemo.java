

class Test<T>
{
T value;
T show(T value)
{
    return value;
}
}

class Genric
{
    public <T> void printArray(T[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class GenericDemo
{
    public static void main(String[] args) 
    {
        // Genric g = new Genric();
        // Scanner s = new Scanner(System.in);
        // System.out.println("enter the array size : ");
        // int size = s.nextInt();
        // Integer arr[] = new Integer[size];
        // String str[] = new String[size];

        // for(int i=0;i<size;i++)
        // {
        //     System.out.println("Enter the integer array input : ");
        //     arr[i]=s.nextInt();
        // }

        // for(int i=0;i<size;i++)
        // {
        // System.out.println("Enter the String array input : ");
        // str[i]=s.nextLine();
        // }

        // g.printArray(arr);
        // g.printArray(str);

        Test<Integer> t1 = new Test<>();
        t1.value=789;
       System.out.println( t1.show(20));
        Test<String> t2 = new Test<>();
        t2.value="welcome";
       System.out.println( t2.show("hello"));
    }
}
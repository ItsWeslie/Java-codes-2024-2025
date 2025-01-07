class Addi{
    public int add()
    {
        int a=5,b=10,c;
        c=a+b;
        return c;
    }

    public int add(int a,int b)
    {
        int c;

        return c=a+b;
    }
}
public class MethodOvr {

    public static void main(String[] args) {
        Addi a = new Addi();
        System.out.println(a.add());
        System.out.println(a.add(10, 05));
    }
}

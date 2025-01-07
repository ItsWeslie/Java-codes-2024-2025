interface MathOperation
{
    int math(int a, int  b);
}
public class LambadaExp {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> a+b;
        MathOperation sub = (a,b) -> a-b;
        MathOperation mul = (a,b) -> a*b;
        MathOperation div = (a,b) -> a/b;
       

        System.out.println(add.math(5, 5));
        System.out.println(sub.math(10, 5));
        System.out.println(mul.math(5, 5));
        System.out.println(div.math(5, 5));
    }
}

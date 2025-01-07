class A{
    void aFunc(){
        System.out.println("inside A");
    }

    void summa()
    {
        System.out.println("inside summa");
    }
}

class B extends A {
void aFunc()
{
    System.out.println("inside B");
}
}

public class DynDisPatch {
public static void main(String[] args) {

    A a = new B();
    a.aFunc();
    a.summa();
}    
}

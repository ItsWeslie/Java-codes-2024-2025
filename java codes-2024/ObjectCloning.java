class CloneDemo implements Cloneable
{
    String name;
    int age;

    CloneDemo(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    CloneDemo(CloneDemo c) {
        this.age=c.age;
        this.name=c.name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class ObjectCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo c = new CloneDemo(22, "sam");
        //CloneDemo d2 = new CloneDemo(c);
        CloneDemo d2 = (CloneDemo) c.clone();

        System.out.println(d2.age + " " + d2.name);
    }
}

class SprCls
{
    String name;
    SprCls(String name)
    {
        this.name=name;

    }
}

class SubCls extends SprCls
{
    
    SubCls(String name)
    {
        super(name);
    }
}
public class SuperKey {
    public static void main(String[] args) {
       
        SprCls sc = new SubCls("prabha");
        System.out.println(sc.name);
        System.out.println(sc.name);
    }
}

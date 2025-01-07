class constr{
    String name;
    int rollno;
    constr()
    {
System.out.println("hi");
    }

    constr(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
}
public class Construct {

    public static void main(String[] args) {
        
        constr c =new constr("sam",232);
        System.out.println(c.name);
        System.out.println(c.rollno);
    }
    
}
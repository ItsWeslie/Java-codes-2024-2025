class Form{
    private String name;
    private int rollno;

    public void setValues(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }

    public String getValues()
    {
        return name;
    }
}
public class Encapsul {
    public static void main(String[] args) {
        Form f = new Form();
        f.setValues("sam", 32);
        System.out.println(f.getValues());
        
    }
}

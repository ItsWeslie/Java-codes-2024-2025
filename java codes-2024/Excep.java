class UserDefined extends Exception
{
    String msg;
    UserDefined(String msg)
    {
        super(msg);
    }
}


public class Excep {

    static void check(int age)throws UserDefined
    {
        if(age<18)
        throw new UserDefined("age invalid");
        else
        throw new UserDefined("age valid");
    }

    public static void main(String[] args) {
        try{
            check(17);
        }
        catch(UserDefined e){
            System.out.println(e.getMessage());
        }
    }
}
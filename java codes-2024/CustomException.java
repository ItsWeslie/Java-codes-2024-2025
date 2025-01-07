
import java.util.Scanner;

class MyException extends Exception
{
  public MyException(String message)
  {
    super(message);
  }
}
public class CustomException
{
public static void main(String[] args) throws MyException {
  Scanner s = new Scanner(System.in);
  int num =s.nextInt();

  if(num<=17) 
  {
    throw new MyException("age is invalid");
  }
}
}
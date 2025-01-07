import java.util.Stack;
public class StackImplementation {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
       
        s.push("{");
        s.push("}");
        
       for(int i=1;i<=s.size();i++)
       {
        String arr[]=new String[s.size()];
        arr[i]=s.pop();
        System.out.println(arr[i]);
       }
    }
}

import java.util.Stack;
public class ValidParanthesis{
    public static void main(String[] args) {
        String str="}()[{({})}]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                stk.push(str.charAt(i));
            }
            else{
                if(  !stk.empty() && 
                      str.charAt(i)==')' && stk.peek()=='(' ||
                      str.charAt(i)==']' && stk.peek()=='[' ||
                      str.charAt(i)=='}' && stk.peek()=='{'     )
                    {
                        stk.pop();
                    }
                    else{
                        return false;
                    }
            }
        }
        return stk.empty();
    }
}
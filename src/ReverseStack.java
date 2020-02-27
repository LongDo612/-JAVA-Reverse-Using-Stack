import java.util.Stack;

public class ReverseStack {
    private static Stack stack1 = new Stack();
    private static Stack stack2 = new Stack();

    public Stack reverseNumber(int[] a){
        for (int i=0;i<a.length;i++) {
            stack1.push(a[i]);
        }
        return stack1;
    }

    public Stack reverseString(String a){
        for (int i=0;i<a.length();i++){
            stack2.push(a.charAt(i));
        }
        return stack2;
    }
}

public class ReverseStackTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String string = "long";
        ReverseStack stack = new ReverseStack();
        System.out.println(stack.reverseNumber(array).pop());
        System.out.println(stack.reverseString(string).pop());
    }
}


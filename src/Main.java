import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        stackCheck("{1+4{77-3}+3}");
        boolean check = stackCheck("{1+4{77-3}+3}");
        System.out.println(check);


    }

    public static boolean stackCheck(String stackPut) {
        Stack<Character> boxStack = new Stack<>();
        char[] arrayToChar = stackPut.toCharArray();
        for (int i = 0; i < arrayToChar.length; i++) {
            if (arrayToChar[i] == '{' || arrayToChar[i] == '[' || arrayToChar[i] == '(') {
                boxStack.push(arrayToChar[i]);
                continue;
            }
            if (arrayToChar[i] == '}' || arrayToChar[i] == ']' || arrayToChar[i] == ')') {

                if (arrayToChar[i] == '}' && boxStack.peek() == '{' || arrayToChar[i] == ']' && boxStack.peek() == '[' ||
                        arrayToChar[i] == ')' && boxStack.peek() == '(') {
                    boxStack.pop();

                } else return false;
            }


        }

        return boxStack.empty();

    }
}

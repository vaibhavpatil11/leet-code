import java.util.*;

public class ValidParentheses {

    static List<Character> OPENING_PAR = Arrays.asList('(', '{', '[');
    static List<Character> CLOSING_PAR = Arrays.asList(')', '}', ']');


    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (OPENING_PAR.contains(c)) {
                characters.push(c);
            } else if (characters.size() != 0 && characters.peek() == OPENING_PAR.get(CLOSING_PAR.indexOf(c))
                    && CLOSING_PAR.contains(c)) {
                characters.pop();
            } else
            {
                return false;
            }

        }

        return characters.isEmpty();
    }

    public static void main(String args[]) {
        ValidParentheses ValidParentheses = new ValidParentheses();
        System.out.println(ValidParentheses.isValid("()[]}"));
    }
}

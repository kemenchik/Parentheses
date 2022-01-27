import java.util.ArrayDeque;
import java.util.Queue;

public class Parentheses {

    //O(n)
    public boolean isSymmetric(String str) {
        if (str == null) {
            return false;
        }
        Queue<Character> result = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                result.offer('(');
            }
            if (c == ')') {
                Character par = result.poll();
                if (par == null || par != '(') {
                    return false;
                }
            }
        }

        return result.isEmpty();
    }

    public boolean isSymmetric2(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == '(' && str.charAt(str.length() - 1 - i) != ')')
                return false;
        }

        return true;
    }

}

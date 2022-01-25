import java.util.ArrayDeque;
import java.util.Queue;

public class Parentheses {


    //O(n)
    public boolean isTrue(String str) {
        if (str == null) {
            return false;
        }
        Queue<Character> result = new ArrayDeque<>();
        char[] buf = str.toCharArray();

        for (char c : buf) {
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
}

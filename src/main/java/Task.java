import java.util.HashSet;
import java.util.Set;

public class Task {
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0)
            return 0;
        Set<String> result = new HashSet<>();
        String[] MorseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (String w : words) {
            StringBuilder str = new StringBuilder();
            for (char c : w.toCharArray()) {
                int index = alphabet.indexOf(c);
                str.append(MorseCode[index]);
            }
            result.add(str.toString());
        }
        return result.size();
    }

    public boolean isHappy(int n) {
        if (n <= 0) return false;
        int time = 100;
        int slow = n;
        int fast = n;
        do {
            slow = nextNum(slow);
            fast = nextNum(fast);
            fast = nextNum(fast);
            if (fast == 1) return true;
        } while (slow!= fast);
        return false;
    }

    private int nextNum(int n) {
        int result = 0;
        while (n > 0) {
            result += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return result;
    }
}

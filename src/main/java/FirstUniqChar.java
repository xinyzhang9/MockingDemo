import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public int run(String s) {
        if(s.length() < 1) return -1;
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(count.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
        
    }
}
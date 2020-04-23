import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean run(String s, String t) {
        Map<Character, Integer> count = new HashMap<Character,Integer>();
        int n = s.length();
        int m = t.length();
        if(n == 0 && m == 0) return true;
        if(n != m || n == 0 || m == 0) return false;
        for(int i = 0; i < n; i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i < m; i++) {
            if(!count.containsKey(t.charAt(i))) {
                return false;
            } else {
                count.put(t.charAt(i), count.get(t.charAt(i))-1);
            }
        }

        for(char c : count.keySet()) {
            if(count.get(c) != 0) return false;
        }
        return true;
    }
}
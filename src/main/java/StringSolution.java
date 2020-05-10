
public class StringSolution {
    public int myAtoi(String str) {
        str = str.trim();
        int index = 0;
        int len = str.length();
        if(len < 1) return 0;
        int sign = 1;
        int total = 0;
        if(str.charAt(0) == '-') {
            sign = -1;
            index++;
        }
        if(str.charAt(0) == '+') {
            index++;
        }
        for(int i = index; i < len; i++) {
            int d = str.charAt(i)-'0';
            if(d < 0 || d > 9) {
                return sign * total;
            }
            boolean overFlow = total > Integer.MAX_VALUE/10 || total == Integer.MAX_VALUE / 10 && d > Integer.MAX_VALUE % 10;
            if(overFlow) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = 10 * total + d;
        }
        return sign * total;
    }

    public int strStr(String haystack, String needle) {
        if(needle.length() < 1) return 0;
        for(int i = 0; i < haystack.length()-needle.length()+1; i++) {
            boolean f = false;
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    f = false;
                    break;
                } else {
                    f = true;
                }
            }
            if(f == true) return i;
        }
        return -1;
    }

    public String countAndSay(int n) {
        if(n <= 0 ) return "";
        if(n == 1) return "1";
        String res = countAndSay(n-1);
        String cur = "";
        for(int i = 0; i < res.length(); i++) {
            int count = 1;
            while(i+1 < res.length() && res.charAt(i) == res.charAt(i+1)) {
                count++;
                i++;
            }
            cur += String.valueOf(count) + res.charAt(i);
        }
        return cur;
    }
}   
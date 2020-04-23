public class IsPalindrome {
    public boolean run(String s) {
        if(s.length() < 1) return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();
        int i = 0; 
        int j = n-1;
        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
class kk {
    public static void main(String args[]) {
        String key = "app";
        String s = "appapplapp";
        String res = "";
        int l = 0;
        int r = s.length();
        
        System.out.println(skipSubstring(s, key, l, r, res));
    }
    
    static String skipSubstring(String s, String key, int l, int r, String res) {
        if (l >= r) { // Base case: when all characters are processed
            return res;
        }
        
        // Use startsWith to check if "apple" starts at index l
        if (s.startsWith(key, l)) {
            // Skip "apple" by moving the index forward by the length of "apple"
            return skipSubstring(s, key, l + key.length(), r, res);
        } else {
            // Otherwise, add the current character to the result and move to the next character
            res += s.charAt(l);
            
        }
        return skipSubstring(s, key, l + 1, r, res);
    }
}

import java.util.*;

class Permutations {
    public static void main(String[] args) {
        String str = "123";
        List<String> results = new ArrayList<>();
        generatePermutations(str, "", results);
        System.out.println(results);
    }
    
    // Helper method to generate permutations
    static void generatePermutations(String str, String perm, List<String> results) {
        // Base case: if the permutation is complete, add to results
        if (str.isEmpty()) {
            results.add(perm);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            // Choose a character and append it to the current permutation
            char ch = str.charAt(i);
            
            // Form the remaining string by excluding the chosen character
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            
            // Recursively generate permutations with the chosen character
            generatePermutations(str.substring(1), left + ch+right, results);
        }
    }
}

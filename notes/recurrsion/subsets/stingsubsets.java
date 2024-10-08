import java.util.ArrayList;
import java.util.List;

public class StringSubsets {
    
    // Recursive method to generate subsets
    private void recurs(List<String> current, int index, String s, List<String> ans) {
        // Base case: when index is out of bounds, add the current subset to the answer
        if (index >= s.length()) {
            List<String> str = new ArrayList<>(current);
            
            ans.add(str.toString()); // Add a copy of current list to the result
            return;
        }

        // Include the current character as a string
        current.add(String.valueOf(s.charAt(index)));
        recurs(current, index + 1, s, ans); // Recurse including the character

        // Exclude the current character (backtrack)
        current.remove(current.size() - 1); // Remove the last added character
        recurs(current, index + 1, s, ans); // Recurse excluding the character
    }

    // Main method to generate all subsets of a string
    public List<String> takenottake(String s) {
        List<String> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();
        recurs(current, 0, s, ans); // Start recursion
        return ans; // Return the final list of subsets
    }

    public static void main(String[] args) {
        StringSubsets subsets = new StringSubsets();
        String input = "He";
        List<String> ans = subsets.takenottake(input);
        System.out.println(ans);
    }
}

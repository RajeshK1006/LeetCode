class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            
            // If the sum has already been seen, we are in a cycle
            if (seenNumbers.contains(sum)) {
                return false;
            }
            
            seenNumbers.add(sum);
            n = sum;  // Move to the next number
        }
        
        return true;  // If n equals 1, the number is happy
    }
}
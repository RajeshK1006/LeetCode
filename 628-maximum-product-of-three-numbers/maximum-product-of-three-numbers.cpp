#include <climits>  // For INT_MIN and INT_MAX

#include <algorithm>  // For max function
using namespace std;

class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int max1 = INT_MIN, max2 = INT_MIN, max3 = INT_MIN; // Use INT_MIN for smallest possible value
        int min1 = INT_MAX, min2 = INT_MAX; // Use INT_MAX for largest possible value

        for (int num : nums) {
            // Track the 3 largest numbers
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3) {
                max3 = num;
            }

            // Track the 2 smallest numbers (for negative cases)
            if (num < min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num < min2) {
                min2 = num;
            }
        }

        // Max product of three numbers: either largest 3 or (largest * 2 smallest for negative cases)
        long long val1 = (long long) max1 * max2 * max3;
        long long val2 = (long long) max1 * min1 * min2;

        return max(val1, val2);
    }
};


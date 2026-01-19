using System.Collections.Generic;

public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> map = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            int rem = target - nums[i];

            if (map.ContainsKey(rem))
            {
                return new int[] { map[rem], i };
            }

            map[nums[i]] = i;
        }

        return new int[] { -1, -1 };
    }
}

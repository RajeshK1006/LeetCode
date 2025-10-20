/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) return new int[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        helper(root,map);
        int maxi = 0;
        for(int num : map.values()){
            maxi = Math.max(maxi, num);
        }
        List<Integer> lst = new ArrayList<>();
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue() == maxi){
                lst.add(it.getKey());
            }
        }

        int[] ans = new int[lst.size()];
        int i=0;
        for(int num:lst){
            ans[i++] = num;
        }

        return ans;
        
    }

    int helper(TreeNode root, HashMap<Integer,Integer> map){
        if(root == null){
            return 0;
        }
    
        int leftsum = helper(root.left, map);
        int rightsum = helper(root.right, map);
        int total = leftsum + rightsum + root.val;

        map.put(total, map.getOrDefault(total,0)+1);

        return total;



    }
}
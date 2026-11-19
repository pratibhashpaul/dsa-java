package Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Taking a single index of the array to check against the other values
        for (int i = 0; i < nums.length; i++) {
            // Checking the remaining indices
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    int check = nums[i] + nums[j];

                    if (check == target) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        return new int[] {};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        Solution obj = new Solution();

        int[] result = obj.twoSum(nums, target);
        // checking whether there are elements in the result array
        if (result.length == 0) {
            System.out.println("Not possible");
        } else {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
    }
}

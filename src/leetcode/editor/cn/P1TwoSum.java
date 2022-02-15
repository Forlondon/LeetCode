//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 8608 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

//Java：两数之和
public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        // TEST
        int[] a = solution.twoSum2(new int[]{1, 2, 3, 4}, 5);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //暴力循环遍历
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{0, 0};
        }

        //用hash表，key存数组的值，value存数组的下标
        public int[] twoSum2(int[] nums, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (hashMap.containsKey(target - nums[i])) {
                    return new int[]{hashMap.get(target - nums[i]), i};
                } else {
                    hashMap.put(nums[i], i);
                }
            }
            return new int[]{0, 0};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

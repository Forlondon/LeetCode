//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 
// 例如，121 是回文，而 123 不是。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 👍 1800 👎 0

package leetcode.editor.cn;

//Java：回文数
public class P9PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new P9PalindromeNumber().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //我的思路：拆成字符，循环比较
        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            //长度为算数，循环遍历s.length()/2次
            if(s.length()%2 == 0){

            }
            return false;
        }

        public boolean isPalindrome2(int x) {
            String reversedStr = (new StringBuilder(x + "")).reverse().toString();
            return (x + "").equals(reversedStr);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
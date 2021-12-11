//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 示例 1:
//
// 输入: "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//
// 示例 2:
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//
// 示例 3:
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
// Related Topics 哈希表 双指针 字符串 Sliding Window
// 👍 4358 👎 0

package com.pinkman.mysolution;

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class P003_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0) return 0;
        int n = 0, p = 0, q = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            q = i;
            char c = chars[i];
            if (map.containsKey(c)){
                n = q - p > n ? q - p : n;
            }
            map.put(c,q);
        }
        return q - p + 1 > n ? q - p + 1 : n;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aw  a"));

    }
}
//leetcode submit region end(Prohibit modification and deletion)

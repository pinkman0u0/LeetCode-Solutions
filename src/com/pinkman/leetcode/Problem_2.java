//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
// 示例：
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
//
// Related Topics 链表 数学
// 👍 4940 👎 0

package com.pinkman.leetcode;

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    ListNode(int[] x){
        val = x[0];
        ListNode p = this;
        for (int i = 1; i < x.length; i++) {
            p.next = new ListNode(x[i]);
            p = p.next;
        }
    }
}

class Problem_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int n = 0;
        int sum = 0;
        ListNode node = null;
        ListNode next = null;

        while (l1 != null || l2 != null){
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;

            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;

            sum = n1 + n2 + n;
            n = 0;
            if (sum > 9){
                sum = sum - 10;
                n = 1;
            }
            if (null == node){
                node = new ListNode(sum);
                next = node;
            }else {
                next.next = new ListNode(sum);
                next = next.next;
            }
        }

        if (n != 0){
            sum = n;
            next.next = new ListNode(sum);
        }

        return node;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 3};
        int[] b = {5, 6, 4};
        ListNode num_1 = new ListNode(a);
        ListNode num_2 = new ListNode(b);

        ListNode sum = addTwoNumbers(num_1,num_2);

        while (sum != null){
            System.out.println("  "+sum.val+"  ");
            sum = sum.next;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

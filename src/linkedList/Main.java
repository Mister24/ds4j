/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package linkedList;

/**
 * @author mr.24
 * @version Id: Main, v 1.0 2020-02-15 22:39 Exp $$
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * 获取链表长度
     * <p>
     * 如果链表为空，返回0
     * 如果不为空，一直进行到链表尾部
     * <p>
     * 时间复杂度：O(n)
     *
     * @param head 头结点
     * @return 长度
     */
    public static int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        int len = 0;
        while (head.next != null) {
            len++;
            head = head.next;
        }

        return len;
    }

    /**
     * 翻转链表
     *
     * @param head 头结点
     * @return 链表
     */
    public static ListNode reverse(ListNode head) {
        // 如果链表不存在或者只有一个结点，直接返回当前链表即可
        if (head == null || head.next == null) {
            return head;
        }

        // 指向head前的结点
        ListNode preNode = null;

        while (head != null) {
            // 标记当前操作的结点
            ListNode temp = head;
            // 指向下一个需要操作结点
            head = head.next;
            // 当前结点的下一结点为【指向head前的结点】
            temp.next = preNode;
            // preNode仍然指向整个
            preNode = temp;
        }

        return preNode;
    }

    public static ListNode recursionReverse(ListNode head) {
        if (head == null || head.next == null)  {
            return head;
        }

        ListNode node = recursionReverse(head.next)
    }
}

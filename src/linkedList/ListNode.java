/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package linkedList;

import java.util.List;

/**
 * 结点
 *
 * @author mr.24
 * @version Id: ListNode, v 1.0 2020-02-15 22:39 Exp $$
 */
public class ListNode<T> {
    T data;
    ListNode next;

    public ListNode(T data) {
        this.data = data;
    }
}

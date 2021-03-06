package com.datatype.C5_advance_function.C5_4_tailrec

data class ListNode(val value: Int, var next: ListNode? = null)

//伪递归
//没有任何操作，直接调用自己并直接返回
tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

//不是伪递归
//调用自己，并且有别的的操作
fun factorial(n: Long): Long {
    return n * factorial(n - 1)
}

//不是伪递归
data class TreeNode(val value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
    fun findTreeNode(root: TreeNode?, value: Int): TreeNode? {
        root ?: return null
        if (root.value == value) return root
        return findTreeNode(root.left, value) ?: return findTreeNode(root.right, value)
    }
}

fun main(args: Array<String>) {
    val MAX_NODE_COUNT = 100000
    val head = ListNode(0)
    var p = head
    for (i in 1..MAX_NODE_COUNT) {
        p.next = ListNode(i)
        p = p.next!!
    }
    //寻找倒数第3个
    println(findListNode(head, MAX_NODE_COUNT - 2)?.value)
}
















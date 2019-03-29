package kolin.mykotlin

data class ListNode(val value: Int, var next: ListNode)

tailrec fun findListNode(head: ListNode, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

data class TreeNode(val value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
fun findTreeNode(root:TreeNode,value: Int){
    
}
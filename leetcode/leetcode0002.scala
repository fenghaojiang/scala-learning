object Solution {
    def main(args:Array[String]):Unit =  {
        
        return 
    }

    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode =  {
        var dummy = new ListNode()
        var carry:Int = 0
        var cur:ListNode = dummy
        var l1t:ListNode = l1
        var l2t:ListNode = l2
        while (l1t != null || l2t != null || carry > 0) {
            var node = new ListNode()
            if (l1t != null) {
                node.x += l1t.x;
                l1t = l1t.next
            }
            if (l2t != null) {
                node.x += l2t.x;
                l2t = l2t.next
            }
            node.x += carry
            carry = node.x / 10
            node.x = node.x % 10
            cur.next = node
            cur = cur.next
        } 
        return dummy.next
    }
}
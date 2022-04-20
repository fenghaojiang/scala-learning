object Solution {
    def main(args:Array[String]):Unit =  {
        
        return 
    }
    class ListNode(_x: Int = 0, _next: ListNode = null) {
        var next: ListNode = _next
        var x: Int = _x
    }
    def reverseList(head: ListNode): ListNode = {
        if (head == null || head.next == null) return head
        var pre:ListNode = null
        var next:ListNode = null
        var cur = head
        while(cur != null) {
          next = cur.next
          cur.next = pre
          pre = cur
          cur = next
        }
        return pre
    }
}
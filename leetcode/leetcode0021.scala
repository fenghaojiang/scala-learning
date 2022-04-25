/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
        if(l1 == null) return l2
    if (l2 == null) return l1
    var newHead = new ListNode(-1)
    var newTail = newHead
    var head1 = l1
    var head2 = l2
    while(head1 != null && head2!=null){
      if(head1.x < head2.x){
        newTail.next = head1
        newTail = newTail.next
        head1 = head1.next
      }else{
        newTail.next = head2
        newTail = newTail.next
        head2 = head2.next
      }
    }
    if(head1 == null)
      newTail.next = head2
    else{
      newTail.next = head1
    }
    return newHead.next
    }
}
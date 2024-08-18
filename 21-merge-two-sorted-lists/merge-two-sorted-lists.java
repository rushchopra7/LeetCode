/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if( list1 == null || list2 == null) {
            return list1 != null ? list1 : list2 ;
        }
            
    
   /* ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;

    while( list1 != null && list2 != null){
        if( list1.val <= list2.val){
            curr.next = list1 ;
        }
        else  {
            curr.next = list2 ;
            list2 = list2.next ;
            }
            curr = curr.next;
 
        
    }
     curr.next = (list1 != null ? list1 : list2);
     return dummy.next ; */
    // using Recusrsion :
    if (list1.val <  list2.val){
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    } else {
        list2.next = mergeTwoLists(list2.next, list1);
        return list2;
    }
} 
}

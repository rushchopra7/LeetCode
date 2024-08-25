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
    public ListNode deleteDuplicates(ListNode head) {
   //Iterator<Listnode> it = head.iterator();
   if(head == null || head.next == null){
    return head ;
   }
   ListNode curr = head;
   while ((curr != null) && (curr.next != null)){
    if(curr.val == curr.next.val ){
     //head.pop(curr);
    curr.next = curr.next.next;
   } else {
    curr = curr.next;
   }

   }
   return head;
    }}

   /*while(!head.isEmpty()){
        if(it.next == it.next.next){
            it.pop(next);
        }
        return head;
        }

    while(!head.isEmpty()){
        if (head > head.next){
            head = head.next;
            head.next = head;
        }
        return head;

        }
    }

  
} */
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { int k=0,sum;
      ListNode joli = new ListNode(0);
      ListNode head = joli;
        while(l1 != null || l2 != null || k != 0){ sum = 0 ;
            if(l1!=null){
                sum = sum + l1.val ;
                l1 = l1.next ;
            } sum = sum + k;
             if(l2 != null){
                sum = sum + l2.val ;
                l2 = l2.next ;
            } k=0 ;
            if (sum >= 10){
                k++ ;
                sum = sum- 10 ;
            } joli.next = new ListNode(sum);
            joli = joli.next; 
        
        }
        return head.next ;
        
    }
}
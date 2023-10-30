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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //if head is null - no node is found
        if(head==null)
            return null;
        
        //if only one node is found
         if(head.next==null)
             return null;
        
        // To find the Size of the List
        int cnt=0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            cnt++;
        }
        
        ListNode del = null;
        ListNode move = head;
        
        // Provision for the last node
        if(cnt==n){
            head=move.next;
            move.next=null;
            return head;
        }
        
        // For iteration upto the position
        for(int i=1; i<cnt-n; i++){
            move=move.next;
        }

        // Logic To delete the node
        del=move.next;
        move.next = move.next.next;
        del.next=null;
            
            
        return head;

    }
}
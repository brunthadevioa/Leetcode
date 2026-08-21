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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null ||k==0) return head;

        int n = 0;

        ListNode temp = head;

        while(temp!=null){

            n++;

            temp = temp.next;

        }

        k = k%n;

        for(int i=0;i<k;i++){

            ListNode last = head;

            while(last.next.next!=null){

                last = last.next;
            }

            ListNode lastNode = last.next;

            last.next = null;

            lastNode.next = head;

            head = lastNode;
        }

        return head;
        
    }
}
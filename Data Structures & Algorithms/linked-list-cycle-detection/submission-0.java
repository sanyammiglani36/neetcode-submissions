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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Map<ListNode,Integer> map = new HashMap<>();
        while(temp != null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,1);
            temp = temp.next;
        }
        return false;
    }
}

package EasyLevel;


 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class MergeTwoSortedList {
    /**
     * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
     *
     * Example:
     *
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     * @param args
     */
    public static void main(String[] args) {

    }

    public ListNode mergeTwoList(ListNode l1, ListNode l2){
        ListNode listNode = new ListNode(0);
        ListNode firstNode = listNode;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                listNode = l1;
                l1 = l1.next;
            }else {
                listNode = l2;
                l2 = l2.next;
            }
            listNode = listNode.next;
        }

        while (l1 != null){
            listNode.next = l1;
            l1 = l1.next;
            listNode = listNode.next;
        }
        while (l2 != null){
            listNode.next = l2;
            l2 = l2.next;
            listNode = listNode.next;
        }
        return firstNode.next;
    }
}

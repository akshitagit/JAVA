class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head!=null && head.val==val)
            head = head.next;
        
        if(head==null)
            return head;
        
        ListNode traversalNode = new ListNode(head.val);
        ListNode retHead = traversalNode;
        
        head=head.next;
        while(head!=null) {
            if(head.val!=val) {
                traversalNode.next = new ListNode(head.val);
                traversalNode = traversalNode.next;
            }
            head = head.next;
        }
        return retHead;
    }
}

import ListNode.ListNode;

public class AddListNodeNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int result = 0;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                result = carry + l1.val + l2.val;

            } else if (l1 == null) {
                result = l2.val + carry;
            } else {
                result = l1.val + carry;
            }
            carry = result / 10;
            curr.next = new ListNode(result % 10);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            curr=curr.next;

        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;


    }


    public static void main(String args[]) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        System.out.println(AddListNodeNumbers.addTwoNumbers(list1, list2));
    }
}

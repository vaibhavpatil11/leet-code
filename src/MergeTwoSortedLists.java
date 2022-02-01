import ListNode.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;
        ListNode result = null;
        ListNode temp = list1;
        ListNode temp1 = list2;
        if(temp == null)  return list2;
        if(temp1 == null) return list1;
        while (temp != null) {
            if (temp1 != null) {
                if (temp.val == temp1.val) {
                    if (head == null) {
                        head = new ListNode(temp.val, null);
                        head.next = new ListNode(temp1.val, null);
                        result = head.next;
                        temp = list1.next;
                        temp1 = list2.next;

                    } else {
                        result.next = new ListNode(temp.val, new ListNode(temp1.val, null));
                        result = result.next.next;
                        temp = temp.next;
                        temp1 = temp1.next;
                    }


                } else if (temp.val < temp1.val) {
                    if (head == null) {
                        head = new ListNode(temp.val, null);
                        result = head;
                        temp = list1.next;

                    } else {
                        result.next = new ListNode(temp.val, null);
                        result = result.next;
                        temp = temp.next;


                    }

                } else if (temp.val > temp1.val) {
                    if (head == null) {
                        head = new ListNode(temp1.val, null);
                        result = head;
                        temp1 = list2.next;
                    } else {
                        result.next = new ListNode(temp1.val, null);
                        result = result.next;
                        temp1 = temp1.next;


                    }

                }
            } else {

                result.next = new ListNode(temp.val, null);
                result = result.next;
                temp=temp.next;
            }
        }
        if(temp1!=null)
        {
            while (temp1!=null)
            {
                result.next = new ListNode(temp1.val, null);
                result = result.next;
                temp1=temp1.next;

            }
        }
        return head;



    }

    public static void main(String args[]) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        //[1,2,4]
        //[1,3,4]
     //   ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
      //  ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
           ListNode list1 = new ListNode(1,null);
           ListNode list2 = new ListNode(2,null);
        System.out.println(mergeTwoSortedLists.mergeTwoLists(list1, list2
        ));

    }
}

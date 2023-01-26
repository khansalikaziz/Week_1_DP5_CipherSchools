package Week_1_DP5_CipherSchools.Class13_14;

public class ReverseaLinkedList {
    public static Node reverseLinkedList(Node head){
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    public static Node reverseLinkedListUsingRecursion(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node next=reverseLinkedListUsingRecursion(head.next);
        head.next.next=head;
        head.next=null;

        return next;

    }
    public static void main(String[] args) {
        Node head=NodeUse.createRandomLinkedList(6);
        NodeUse.printLinkedList(head);
        System.out.println();
        NodeUse.printLinkedList(reverseLinkedList(head));
        Node head1=NodeUse.createRandomLinkedList(6);
        System.out.println();
        NodeUse.printLinkedList(reverseLinkedListUsingRecursion(head1));

    }
}

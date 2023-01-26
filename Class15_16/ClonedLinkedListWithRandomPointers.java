package Week_1_DP5_CipherSchools.Class15_16;

import Week_1_DP5_CipherSchools.Class13_14.Node;

public class ClonedLinkedListWithRandomPointers {
    public static Node createClone(Node head){
        Node original=head;
        if(head==null){
            return head;
        }
        while (original!=null && original.next!=null){
            Node clonedNode=new Node(original.getData());
            Node next=original.getNext();
            original.next=clonedNode;
            clonedNode.next=next;
            original=original.next.next;
        }
        original.next=new Node(original.getData());
        original=head;
        while (original!=null && original.next!=null){
            if(original.random!=null){
                original.next.random=original.random.next;
            }
            original=original.next;
        }
        original=head;
        Node copy=head.next;
        Node newHead=head.next;
        while (original.next!=null && copy.next!=null){
            original.next=original.next.getNext();
            copy.next=copy.next.next;
            original=original.next;
            copy=copy.next;
        }
        original.next=null;
        return  newHead;
    }
}

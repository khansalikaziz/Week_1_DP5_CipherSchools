package Week_1_DP5_CipherSchools.Class13_14;

public class NodeUse {
    public static void printLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static Node createRandomLinkedList(int size){
        Node head=null;
        Node cur=null;
        Node prev=null;
        while(size>0){
            cur=new Node(size*10);
            cur.next=prev;
            prev=cur;
            size--;
        }
        head=prev;
        return head;
    }
    public static void main(String[] args) {
        Node node1=new Node(4);
        Node node2=new Node(6);
        Node head=node1;

        node1.next=node2;
        printLinkedList(head);
    }
}

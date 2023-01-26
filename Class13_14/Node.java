package Week_1_DP5_CipherSchools.Class13_14;

public class Node {
//    public void setNext(Node next){
//        this.next=next;
//    }
    public int data;
    public Node next;
    public Node random;
    public Node(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
}

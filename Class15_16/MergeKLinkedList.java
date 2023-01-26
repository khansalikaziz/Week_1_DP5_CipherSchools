package Week_1_DP5_CipherSchools.Class15_16;

/*
while(i<k){
    1.Divide the set of linked list into two half
        i=l1,k=ln-1
    2.Merge l1=l1+l2
    3.Merge rest of halves
    4.Merge L1=L1+rest of halves
}
 */

import Week_1_DP5_CipherSchools.Class13_14.Node;
import Week_1_DP5_CipherSchools.Class13_14.NodeUse;

public class MergeKLinkedList {
    public static Node MergeKLL(Node[] arr){
        int remainingLL= arr.length-1;
        while (remainingLL!=0){
            int i=0;
            int k= remainingLL;
            while(i<k){
                arr[i]=mergeTwoSortedll(arr[i],arr[k]);
                i++;
                k--;
                if(i>=k){
                    remainingLL=k;
                }
            }
        }
        return arr[0];
    }
    private static Node mergeTwoSortedll(Node l1, Node l2) {
        Node sortedResult=null;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.getData()<=l2.getData()){
            sortedResult=l1;
            sortedResult.next=mergeTwoSortedll(l1.next,l2);
        }
        else{
            sortedResult=l2;
            sortedResult.next=mergeTwoSortedll(l1,l2.next);
        }
        return sortedResult;
    }

    public static void main(String[] args) {
        Node[] arr=new Node[3];
        Node node1=new Node(1);
        node1.next=new Node(3);
        node1.next.next=new Node(5);
        node1.next.next.next=new Node(8);
        arr[0]=node1;

        Node node2=new Node(2);
        node2.next=new Node(6);
        node2.next.next=new Node(10);
        node2.next.next.next=new Node(12);
        arr[1]=node2;

        Node node3=new Node(4);
        node3.next=new Node(9);
        node3.next.next=new Node(11);
        arr[2]=node3;

        Node head=MergeKLL(arr);
        NodeUse.printLinkedList(head);
    }
}

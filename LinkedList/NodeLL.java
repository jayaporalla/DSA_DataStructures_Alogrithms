package LinkedList;

public class NodeLL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // Creating Indiviual Nodes
        Node first = new Node(5);
        Node second = new Node(8);
        Node third = new Node(4);
        Node fourth = new Node(2);
        // Connecting the Nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        // traversal the nodes i.e., for-each
        Node head = first;
        while(head != null){
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.print("null");
    }
}

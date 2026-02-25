package LinkedList;

public class CircularSingleLinkedList {
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
        // connecting tail to head - circularSingleLinkedList
        fourth.next = first;
        // traversal the nodes i.e., for-each
        Node currenthead = first;
        Node head = first;
        System.out.print(currenthead.data + " --> ");
        currenthead = currenthead.next;
        while(currenthead != head){
            System.out.print(currenthead.data + " --> ");
            currenthead = currenthead.next;
        }
        System.out.print("....");
    }
}

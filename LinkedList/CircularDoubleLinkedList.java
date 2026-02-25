package LinkedList;

public class CircularDoubleLinkedList {
     static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.prev = null;
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
        // Connecting next the Nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        // connecting prev nodes
        second.prev = first;
        third.prev = second;
        fourth.prev = third;
        // connecting tail to head - circularDoubleLinkedList
        fourth.next = first;
        first.prev = fourth;
        // traversal the nodes i.e., for-each
        Node currenthead = first;
        Node head = first;
        System.out.print("Forward List: ");
        System.out.print(currenthead.data + " --> ");
        currenthead = currenthead.next;
        while(currenthead != head){
            System.out.print(currenthead.data + " --> ");
            currenthead = currenthead.next;
        }
        System.out.print("......"); // looping back to the list
        currenthead = fourth;
        head = fourth;
        System.out.println();
        System.out.print("Backward List: ");
        System.out.print(currenthead.data + " --> ");
        currenthead = currenthead.next;
        while(currenthead != head){
            System.out.print(currenthead.data + " --> ");
            currenthead = currenthead.next;
        }
        System.out.print("......"); // looping back to the list
    }
}

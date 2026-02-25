package LinkedList;

public class DoubleLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(8);
        Node third = new Node(4);
        Node fourth = new Node(2);
        // next connecting
        first.next = second;
        second.next = third;
        third.next = fourth;
        // prev connecting
        second.prev = first;
        third.prev = second;
        fourth.prev = third;

        Node head = first;
        System.out.print("Forward Node: ");
        while(head != null){
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.println("Null");
        
        System.out.print("Backward Node: ");
        head = fourth;
        while(head != null){
            System.out.print(head.data + " --> ");
            head = head.prev;
        }
        System.out.print("Null");
    }
}

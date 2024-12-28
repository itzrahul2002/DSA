package Scalar;

import org.w3c.dom.Node;

public class Linklist_add
{
    public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
    }
    public static Node addfirst(Node head, int value){
        Node n = new Node(12);
        n.next = head;
        head = n;

        return n;
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
        head = addfirst(head,16);

    }
}

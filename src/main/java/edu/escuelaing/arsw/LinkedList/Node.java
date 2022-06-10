package edu.escuelaing.arsw.LinkedList;

public class Node {
    double data;
    Node next;
    Node head;

    public Node(double data) {
        this.data = data;
    }

    public void agregar(double data) {
        Node actual = this;
        while (actual.next != null) {
            actual = actual.next;
        }
        actual.next = new Node(data);
    }

    public double getData() {
        return data;
    }
    
    public Node getNext() {
        return next;
    }
}


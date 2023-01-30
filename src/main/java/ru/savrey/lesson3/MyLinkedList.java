package ru.savrey.lesson3;

public class MyLinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void revert(){
        if (head != null && head.getNext() != null)
            revert(head.getNext(), head);
    }

    private void revert(Node current, Node prev){
        if (current.getNext() == null){
            head = current;
        } else {
            revert(current.getNext(), current);
        }
        current.setNext(prev);
        prev.setNext(null);
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if (head != null)
            node.setNext(head);
        head = node;
    }

    public void removeFirst(){
        if (head != null)
            head = head.getNext();
    }

    public Node contains(int value){
        Node node = head;
        while (node != null){
            if (node.getValue() == value)
                return node;
            node = node.getNext();
        }
        return null;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
        }
        else {
            Node last = head;
            while (last.getNext() != null){
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

    public void removeLast(){
        if (head == null)
            return;

        Node node = head;
        while (node.getNext() != null){
            if (node.getNext().getNext() == null){
                node.setNext(null);
                return;
            }
            node = node.getNext();
        }
        head = null;
    }

    public void print(){
        Node node = head;
        while (node != null){
            System.out.printf("%d ", node.getValue());
            node = node.getNext();
        }
        System.out.println();
    }
}

package ru.savrey.lesson3;

public class LessonApp {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.addLast(7);
        myLinkedList.addLast(8);
        myLinkedList.addLast(9);
        myLinkedList.addLast(10);

        Node head = myLinkedList.getHead();

        System.out.println(middleNode(head).getValue());
        System.out.println(middleNodeMine(head).getValue());

    }

    public static Node middleNode(Node head){
        int length = 1;
        Node node = head;
        while (node.getNext() != null){
            length++;
            node = node.getNext();
        }

        length = length / 2 + 1;

        node = head;
        for (int i = 0; i < length - 1; i++){
            node = node.getNext();
        }
        return node;
    }

    public static Node middleNodeMine(Node head){
        Node node = head;
        Node middle = head;

        boolean odd = true;
        while (node.getNext() != null){
            node = node.getNext();
            if (odd)
                middle = middle.getNext();
            odd = !odd;
        }
        return middle;
    }
}

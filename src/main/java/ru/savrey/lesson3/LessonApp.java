package ru.savrey.lesson3;

public class LessonApp {
    public static void main(String[] args) {

        // ДОМАШНЕЕ ЗАДАНИЕ: написать метод разворота связанного списка
        // Метод разворота revert реализован в классах MyLinkedList и MyLinkedListV2

        // Однонаправленный связанный список
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

        myLinkedList.print();

        // Разворот однонаправленного связанного списка
        myLinkedList.revert();
        myLinkedList.print();
        System.out.println(myLinkedList.getHead().getValue());


        // Двунаправленный связанный список
        MyLinkedListV2 myLinkedListV2 = new MyLinkedListV2();

        myLinkedListV2.addLast(21);
        myLinkedListV2.addLast(22);
        myLinkedListV2.addLast(23);
        myLinkedListV2.addLast(24);
        myLinkedListV2.addLast(25);
        myLinkedListV2.addLast(26);
        myLinkedListV2.addLast(27);
        myLinkedListV2.addLast(28);
        myLinkedListV2.addLast(29);
        myLinkedListV2.addLast(30);

        myLinkedListV2.print();

        // Разворот двунаправленного связанного списка
        myLinkedListV2.revertV2();
        myLinkedListV2.print();
        System.out.println(myLinkedListV2.getHead().getValue());
        System.out.println(myLinkedListV2.getTail().getValue());



//        Node head = myLinkedList.getHead();
//
//        System.out.println(middleNode(head).getValue());
//        System.out.println(middleNodeMine(head).getValue());


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

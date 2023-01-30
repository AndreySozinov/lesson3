package ru.savrey.lesson3;

public class MyLinkedListV2 {

    private NodeV2 head;
    private NodeV2 tail;

    /**
     * Разворот двунаправленного связанного списка MyLinkedListV2
     */
    public void revertV2(){
        NodeV2 node = head;
        while (node != null){
            NodeV2 next = node.getNext();
            NodeV2 prev = node.getPrevious();
            node.setNext(prev);
            node.setPrevious(next);
            if (prev == null)
                tail = node;
            if (next == null)
                head = node;
            node = next;
        }
    }



    public void addFirst(int value){
        NodeV2 node = new NodeV2(value);
        if (head != null){
            node.setNext(head);
            head.setPrevious(node);
        }
        else {
            tail = node;
        }
        head = node;
    }

    public void addLast(int value){
        NodeV2 node = new NodeV2(value);
        if (head == null){
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    public void removeFirst(){
        if (head != null && head.getNext() != null){
            head.getNext().setPrevious(null);
            head = head.getNext();
        } else {
            head = null;
            tail = null;
        }
    }

    public void print(){
        NodeV2 node = head;
        while (node != null){
            System.out.printf("%d ", node.getValue());
            node = node.getNext();
        }
        System.out.println();
    }

    public NodeV2 getHead() {
        return head;
    }

    public void setHead(NodeV2 head) {
        this.head = head;
    }

    public NodeV2 getTail() {
        return tail;
    }

    public void setTail(NodeV2 tail) {
        this.tail = tail;
    }
}

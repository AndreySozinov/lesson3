package ru.savrey.lesson3;

public class NodeV2 {

    private int value;
    private NodeV2 next;

    private NodeV2 previous;

    public NodeV2 getPrevious() {
        return previous;
    }

    public void setPrevious(NodeV2 previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeV2 getNext() {
        return next;
    }

    public void setNext(NodeV2 next) {
        this.next = next;
    }

    public NodeV2(int value) {
        this.value = value;
    }
}

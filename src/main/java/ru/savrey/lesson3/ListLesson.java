package ru.savrey.lesson3;

import java.util.ArrayList;

public class ListLesson {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10000);
        list.ensureCapacity(1000);
    }
}


class MyCollection{

    private int[] arr;
    private int capacity;
    private int length = 0;

    public MyCollection(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public MyCollection(){
        capacity = 10;
        arr = new int[capacity];
    }

    public void add(int i){
        arr[length] = i;
        length++;
    }
}
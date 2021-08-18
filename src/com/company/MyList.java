package com.company;

import java.util.Arrays;

public class MyList {
    private int size = 10;
    private int[] elements;
    private int count = 0;

    public MyList() {
        elements = new int[size];
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    private void ensureCapacity() {
        int newSize = size * 2;
        Arrays.copyOf(elements, newSize);
    }

    public void add(int index, int value) {
        if (count == size) {
            ensureCapacity();
        }
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = elements[i];
            } else if (i == index) {
                newArray[index] = value;
            } else {
                newArray[i] = elements[i - 1];
            }
        }
        elements = newArray;
        this.count++;
    }

    public void remove(int index) {
        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = elements[i];
            } else {
                newArray[i] = elements[i + 1];
            }
        }
        elements = newArray;
        this.count--;
    }

    public int size() {
        return this.count;
    }

    public MyList clone() {
        MyList myList = new MyList();
        myList.count = this.count;
        myList.size = this.size;
        myList.elements = this.elements;
        return myList;
    }

    public boolean contains(int value) {
        boolean isContain = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    public int indexOf(int value) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void clear() {
        size = 10;
        count = 0;
        elements = new int[size];
    }

    public int get(int index) {
        return elements[index];
    }
}

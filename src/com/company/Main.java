package com.company;

public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(0,1);
        myList.add(0,2);
        myList.add(1,0);
        for (int x: myList.getElements()) {
            System.out.println(x);
        }
        System.out.println("-------------------");
        myList.remove(1);
        for (int x: myList.getElements()) {
            System.out.println(x);
        }
        System.out.println("--------------------");
        System.out.println(myList.size());
        System.out.println("--------------------");
        MyList coppy = myList.clone();
    }
}

package ru.site.start.lesson26;

import java.util.*;

public class Start4 {
    public static void main(String[] args) {
        People p1 = new People("Григорий", 29);
        People p2 = new People("Олег", 20);
        People p3 = new People("Виктор", 14);
        People p4 = new People("Максим", 35);
        People p5 = new People("Григорий", 29);
        Cat c1 = new Cat("Барсик", 3);
        List<People> listPeoples = new ArrayList<>();
        listPeoples.add(p1);
        listPeoples.add(p2);
        listPeoples.add(p3);
        listPeoples.add(p4);

//        System.out.println("p1 equals p5 ? " + (listPeoples.contains(p5)));

        Float z = 5f;
        Float z1 = 51f;

        Integer a = 5;
        int b = 5;
        int c = 7;
//        System.out.println(a == a); // true
//        System.out.println(a == b); // true
//        System.out.println(a == c); // false

        System.out.println(z.equals(z1));

        Integer a11 = new Integer(5);
        Integer b11 = new Integer(5);
        Integer c11 = new Integer(7);
//        System.out.println(a11 == a11); // true
//        System.out.println(a11 == b11); // false
//        System.out.println(a11 == c11); // false

//        System.out.println(a11.equals(b11)); // true

        Integer i1 = Integer.valueOf(3);
        Integer i2 = Integer.valueOf(3);
        Integer i3 = Integer.valueOf(9);
//        System.out.println(i1 == i1); // true
//        System.out.println(i1 == i2); // true
//        System.out.println(i1 == i3); // false



    }
}

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

//    @Override
//    public boolean equals(Object object) {
//        if(object instanceof Cat) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}

class People {
    String name;
    int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof People) {
            People people = (People)object;
            if(name == people.name && age == people.age) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
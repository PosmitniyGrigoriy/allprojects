package ru.site.start.lesson27and28;

import org.w3c.dom.ls.LSOutput;

public class Start {
    public static void main(String[] args) {

        // »ксепшины хран€тс€ в java.lang.*

        // v1
        // »ксепшин ArrayIndexOutOfBoundsException когда хотим вызывать элемент по какому-то индексу, а такого индекса нет (вышли за пределы)
//        int array[] = {3, 6, 1};
//        System.out.println(array[5]); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
//        System.out.println("Hello"); // Ёта строка уже не выведетс€, так как первый саут выдаст иксепшин

        // v2
        // »ксепшин NullPointerException когда хотим получить что-то на нал
        String text = null;
        System.out.println(text.length()); // NullPointerException. ѕеременна€ text пуста€, а у ничего не может быть длины (это уже дл€ саута)


    }
}

class Test1 {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        System.out.println(animal.a);
        System.out.println(animal.b);
        animal.abc();
        animal.def();
    }
}

class Animal {
    int a = 5;
    static int b = 10;
    void abc() {
        System.out.println("non-static method Animal");
    }
    static void def() {
        System.out.println("static method Animal");
    }
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;
    void abc() {
        System.out.println("non-static method Tiger");
    }
    static void def() {
        System.out.println("static method Tiger");
    }
}
/**
 * –езультат вывода:
 * 5
 * 10
 * non-static method Tiger
 * static method Animal
 */


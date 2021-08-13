package ru.site.start.lesson35;

public class Start36 {
}

// Задание 36
// Даны 2 пакета со следующими классами. Что будет результатом компиляции и запуска данного кода?

//package p1;
//
//public class A {
//    public static int x = 3;
//}
//
//package p2;
//import p1.*;
//import static p1.A.*;
//
//public class B {
//
//    static A a1 = new A();
//    static A a2 = new A();
//
//    {
//        System.out.println("Vsem xoroshego dnya!");
//    }
//
//    public static void main(String[] args) {
//        a1.x = 5;
//        a2.x = 10;
//        System.out.println(a1.x);
//    }
//
//}

// Результат вывода:

// 10

// Объяснение к коду:


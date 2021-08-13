package ru.site.start.lesson35;

public class Start27 {
}

// Задание 27
// Что будет результатом компиляции и запуска данного кода?

//class A {
//
//    int a = 3;
//
//    int returnA() {
//        System.out.println("Klass A " + a);
//        return a;
//    }
//
//}
//
//class B extends A {
//
//    int a = 5;
//
//    public int returnA() {
//        System.out.println("Klass B " + a);
//        return a;
//    }
//
//    public static void main(String[] args) {
//        A test1 = new B();
//        System.out.println(test1.a + " " + test1.returnA());
//        B test2 = (B) test1;
//        System.out.println(test2.a + " " + test2.returnA());
//    }
//
//}

// Результат вывода:

// Klass B 5
// 3 5
// Klass B 5
// 5 5

// Объяснение к коду:


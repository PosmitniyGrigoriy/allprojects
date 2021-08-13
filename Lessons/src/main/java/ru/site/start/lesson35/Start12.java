package ru.site.start.lesson35;

public class Start12 {
}

// Задание 12
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    void abc() {
//        try {
//            def();
//            return;
//        } finally {
//            System.out.println("finally");
//        }
//    }
//
//    void def() {
//        System.out.println("def");
//        throw new StackOverflowError();
//    }
//
//    public static void main(String args[]) {
//        Test t = new Test();
//        t.abc();
//    }
//
//}

// Результат вывода:

// def
// finally
// StackOverflowError

// Объяснение к коду:


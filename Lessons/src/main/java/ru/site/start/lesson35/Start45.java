package ru.site.start.lesson35;

public class Start45 {
}

// Задание 45
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    static String s = "";
//
//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } catch (Exception e1) {
//            try {
//                try {
//                    throw new Exception();
//                } catch (Exception e2) {
//                    s += "1";
//                }
//                throw new Exception();
//            } catch (Exception e3) {
//                s += "2";
//            } finally {
//                s += "3";
//            }
//        } finally {
//            s += "4";
//        }
//        System.out.println(s);
//    }
//
//}

// Результат вывода:

// 1234

// Объяснение к коду:


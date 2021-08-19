package ru.site.start.lesson24;

public class Start2 {

    /**
     * Тема: интерфейс
     *
     *
     */

    interface Help_able {
        public abstract void pomosh(); // Джава сама подставит abstract. Это слово писать не обязательно. Тоже самое и для public.
        void tushitPojar();
    }

    interface Swim_able {
        void swim();
    }

    static class Employee {

        String name;
        int age;

        Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void eat() {
            System.out.println("Работник ест");
        }
        void sleep() { System.out.println("Работник спит"); }

    }

    static class Doctor extends Employee implements Help_able {
    //Если дописать к классу abstract и implements Help_able, то класс не может создать объект, а также
        // не нужно переопределять методы. Если нужно переопределить методы, то не писать abstract у класса
        String post;

        Doctor(String name, int age, String post) {
            super(name, age);
            this.post = post;
        }

        void doHealth() {
            System.out.println("Доктор лечит");
        }

        // При переопределии методов обязательно писать public у методов, иначе будет ошибка.
        // Писать public у методов, так как в интерфейсу у абстрактного метода уровень доступа паблик, просто
        // он сам дописывается, а здесь не дописывается, поэтому самому паблик нужно писать
        public void pomosh() {}
        public void tushitPojar() {}

    }

    // Ниже указано 2 интерфейса в имплементации
    static class Surgeon extends Doctor implements Help_able, Swim_able {

        int salary;

        Surgeon(String name, int age, String post, int salary) {
            super(name, age, post);
            this.salary = salary;
        }

        void doOperation() {
            System.out.println("Хирург проводит операцию");
        }

        public void pomosh() {}
        public void tushitPojar() {}
        public void swim() {}
        
    }

        public static void main(String[] args) {
            Surgeon z1 = new Surgeon("Виктор", 30, "Хирург", 100);
            Doctor z2 = new Surgeon("Виктор", 30, "Хирург", 100);
            Employee z3 = new Surgeon("Виктор", 30, "Хирург", 100);
        }

}

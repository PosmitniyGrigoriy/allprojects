package ru.site.start.lesson24;

public class HomeWork {

    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Èìÿ 1");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        System.out.println("----------");

        Speakable speakable = new Pingvin("Èìÿ 2");
        speakable.speek();

        System.out.println("----------");

        Animal animal = new Lev("Èìÿ 3");
        System.out.println(animal.name);
        animal.eat();
        animal.sleep();

        System.out.println("----------");

        Mammal mammal = new Lev("Èìÿ 4");
        System.out.println(mammal.name);
        mammal.eat();
        mammal.run();
        mammal.sleep();
        mammal.speek();
    }

}

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();

}

abstract class Fish extends Animal {

    String name;

    Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Vsegda interesno nablydat, kak spyat ribi");
    }

    abstract void swim();

}

abstract class Bird extends Animal implements Speakable {

    String name;

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speek() {
        System.out.println("Somebody speaks sings");
    }

}

abstract class Mammal extends Animal implements Speakable {

    String name;

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();

}

interface Speakable {

    default void speek() {
        System.out.println("Somebody speaks");
    }

}

class Mechenosec extends Fish {

    String name;

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba, ona est obichniy ribiy korm!");
    }

}

class Pingvin extends Bird {

    String name;

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    public void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }

}

class Lev extends Mammal {

    String name;

    Lev(String name) {
        super(name);
        this.name = name;
    }

    public void eat() {
        System.out.println("Lev, kak lyuboy sishnik, lyubit myaso!");
    }

    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    public void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }

}

// Result:
//        Èìÿ 1
//        Mechenosec ne xishnaya riba, ona est obichniy ribiy korm!
//        Mechenosec krasivaya riba, kotoraya bistro plavaet!
//        Vsegda interesno nablydat, kak spyat ribi
//        ----------
//        Somebody speaks sings
//        ----------
//        Èìÿ 3
//        Lev, kak lyuboy sishnik, lyubit myaso!
//        Bolshuyu chast dnya lev spit!
//        ----------
//        Èìÿ 4
//        Lev, kak lyuboy sishnik, lyubit myaso!
//        Lev - eto ne samaya bistraya koshka!
//        Bolshuyu chast dnya lev spit!
//        Somebody speaks

package ru.site.start.lesson26;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Start {
}

/**
 * Метод equals.
 *
 * Если не переопределять метод equals, то он будет работать как ==.
 * == работает так: если два объекта ссылаются на один объект, то true.
 */

class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        Car c4 = new Car("black", "V8");

        System.out.println(c1 == c2); // false
        System.out.println(c1.equals(c2)); // false - если метод equals не переопределен. true - если метод equsl переопределен (ниже метод переопределен).

        List<Car> listCar = List.of(c1, c2, c3);
        System.out.println(listCar.contains(c4)); // false - если метод equals перегружен как ниже в коде написано, true - если метод equals переопределен, тоже ниже в коде показано. Подробное объяснение есть в зеленом блоке.
        System.out.println(listCar);

        // Метод parse есть у всех wrapper classes. Конвертирует значение String в примитивный тип данных.
        String s1 = "100";
        int result = Integer.parseInt(s1); // Конвертирует стрин в инт.
        System.out.println(result);

        String s2 = " 200"; // Если парсить этот стрин (здесь пробел перед 100), то будет иксепшин. Не правильно указан формат для конвертации строки в инт. Нужно сначала у строки убрать пробел в начале, затем конвертировать в инт.
//        String s3 = s2.replace(" ", ""); // v1
//        String s3 = s2.strip(); // v2
//        String s3 = s2.trim(); // v3
        String s3 = s2.substring(1, 4); // v4
        int result2 = Integer.parseInt(s3); // Конвертирует стрин в инт.
        System.out.println(result2);

        String s4 = "true";
        boolean result4 = Boolean.parseBoolean(s4);
        System.out.println(result4); // Если будет так написано, то сохранится true. String s4 = "true";
        // Если внутри стрин по другому написать String s4 = "sssstrue"; , то сохранится false.

        // Метод valueOf создает новый объект wrapper класса того типа, на котором данный метод был вызван.
        // Создает новый объект. Аналог Integer i = new Integer(10);
        Integer i2 = Integer.valueOf(10);

        // Классы System, String, StringBuilder являются final, поэтому эти классы нельзя наследовать.

        // Три варианта, как можно написать в меньшем типе данных в кэнстрактэ.
        // В кэнстрактэ нельзя устанавливать значение 5, 99, 66 прямо, так как это инт, а не байт.
        Byte b9=5;
        Byte b10 = new Byte(b9);
        System.out.println(b10);

        Byte b99;
        b99 = 99;
        Byte b100 = new Byte(b99);
        System.out.println(b100);

        Byte b1000 = new Byte((byte)66);
        System.out.println(b1000);

        // Нельзя сравнивать int == double. Один тип сравнивать с этим же типом можно, но не с другим.
        // У wrapper классов есть метод equals. Его можно использовать вместо == для сравнения цифр.
        // Но если будет сравнение Integer и Double, то компиляционной ошибки не будет, как при ==, но во время
        // ран тайм баиндин будет фолс, так как объекты разные: integer и Double.

    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    // Так выглядит метод equals по умолчанию. Он работает как ==.
//    public boolean equals (Object obj) {
//        return (this == obj);
//    }

    // Метод equals переопределенный автора видео
    @Override
    public boolean equals (Object obj) {
        if(obj instanceof Car) { // Здесь будет сравниваться строка: c1.equals(c2). Машина = машине как объект? Да. А если машина и цветок, то сразу фолс выдает, так как два разных объекта сравниваются
            return (color == ((Car) obj).color && engine == ((Car) obj).engine);
        } else {
            return false;
        }
    }

    // Метод equals перегружен (так как в параметрах не (Object obj), а (Car car)). В данном коде метод equals не переопределен, но он тоже будет работать, но только с Car. А метод equals, работает с любыми объектами. так как там в параметрах (Object obj).
//    public boolean equals (Car car) {
//        return (color.equals(car.color) && engine.equals(car.engine));
//    }

    /** Если была бы коллекция и там были бы те 3 объекта машин, и создан еще четвертный объект
     * как третий, но он не был бы в коллекции, но вызывать метод contains. listCar.contains(c4);
     * и будет false, так как метод contains использует метод  equals, где в параметрах (Object obj).
     * А у нас в коде выше метод не переопределен, а перегружен, поэтому сработает стандартный метод
     * equals, а он работает как ==, поэтому будет false. Коллекция не содержит этот объект.
     * При перегруженном методе contains будет выдавать false, а при переопределенном методе выше
     * метод contains будет выдавать true.
     */

    // Метод equals переопределенный idea
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return color.equals(car.color) && engine.equals(car.engine);
//    }

    // Метод equals переопределенный eclipse
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Start other = (Start) obj;
//        if (age != other.age)
//            return false;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        return true;
//    }

    @Override
    public String toString() {
        return color + " " + engine;
    }
}

/**
 * Метод toString.
 *
 * Дэфалтная реализация метода возвращает имя класса, @, число (результат метода hashcode данного объекта).
 * Пример. Если выводить первый элемент в коллекции, то будет вывод такой:
 * ru.site.start.lesson26.Car@6bdf28bb
 * Число 6bdf28bb в шестнадцатеричной системе счисления.
 */

// Переопределенный метод toString ниже. Когда он написано, вывод будет уже не ru.site.start.lesson26.Car@6bdf28bb
// а в читабельном виде.

//@Override
//public String toString() {
//    return color + " " + engine;
//}

// Вывод: [red V4, red V4, black V8]

/**
 * Wrapper classes.
 * Wrapper переводится как обертка.
 * Чтобы можно было видеть примитивные типа данных как классы. Например, int в классе Integer.
 * byte => Byte
 * short => Short
 * int => Integer
 * long => Long
 * float => Float
 * double => Double
 * boolean => Boolean
 * char => Char или Character. В видео было Char, но я писал Character
 */

class Test2 {
    public static void main(String[] args) {
// Autoboxing - конвертирование примитивных типов данных в соответствующих wrapper класс.
// Пример ниже.
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(5); // Autoboxing. Здесь указана 5. Это примитивный тип данных (int). Далее эта 5 в int конвертируется в Integer, затем добавилась 5 в коллекцию.

        Long q = 50L; // Autoboxing. Здесь указано 50. 50 в лонге - это примитивный тип данных. 50 сохраняется в референс тип данных (Long). Под класс Long.

// Unboxing - конвертирование объекта тип wrapper класс в соответствующий примитивный тип данных.
        int result = listNumbers.get(0); // Unboxing. Получаем объект класса Integer. Он на выход выдает int, сохраняем в примитивном типе (было в рефренс, в классе).
        System.out.println(result);

        Integer i = new Integer(55);
        int result2 = i; // Unboxing. Integer сохраняет в int.

        // В классе Number есть такие примитивные типа данных: byte, short, int, long, float, double.
        // Можно класс Number указать в типе выше, вместо Integer. Но тогда кастовать нужно будет, чтобы положить в int.
    }
}

/**
 * Приоритетность вызова методов, при overloading method
 * Выберется тот метод, который самый точным будет.
 */

class Test3 {
    void abc(int a) { System.out.println("int"); }
    void abc(byte a) { System.out.println("byte"); }
    void abc(long a) { System.out.println("long"); }

    // Если при вызове метода его параметр лист соответствует нескольким параметрам лист overloaded методов,
    // то приоритет их вызова выглядит следующим образом:
    // 1. Точное совпадение типов данных
    // 2. Больший тип данных для примитивных типов данных и родительский класс
    // 3. Autoboxed типы данных
    // 4. Varargs.

    void ghi(int a, int b) { System.out.println("Hello 1"); } // Если все 4 метода ниже раскомментированы, то использоваться будет первый
    void ghi(long a, long b) { System.out.println("Hello 2"); } // Если первый метод закомментировать, то будет использовать второй методом (с лонгом)
    void ghi(Integer a, Integer b) { System.out.println("Hello 3"); } // Если второй метод закомментировать, то будет использоваться третий метод (с Wrapper классом)
    void ghi(int ... a) { System.out.println("Hello 4"); } // Если третий метод закомментировать, то будет использоваться четвертый метод с вар аргс.

    // Конвертация типов данных для соответствия параметр листу метоже не может происходить в 2 этапа.
    static void def(Long a) { System.out.println("A"); }
    static void def(Long  ... a) { System.out.println("B"); }
    static void def(long  a) { System.out.println("C"); }
    static void def(Object a) { System.out.println("D"); }
    static void def(Integer a) { System.out.println("E"); }

    /**
     * Выше код с методами der().
     * Если в мэин вызывать этот метод def(50); , то:
     * Из 5 методов выберется, где вывод С, так как это самый точный тип будет. int установлено, конвертируется в long и выводится в long (не конвертируется в Long, так как нет L у числа).
     * Если этот метод закомментировать, то выберется с выводом Е. Затем с выводом D.
     * Первй и второй метод не подходят с лонгом, так как при вызове метода было указано def(50);
     * Здесь нет буквы L. Поэтому это не Long, а Integer.
     *
     * Так как в мэин вызывается def(50); здесь указан int.
     * Нельзя 2 раза преобразовать число. Можно только 1 раз. Поэтому int конвертируется в long, и потом
     * не может уже преобразоваться в AutoBoxing в Long.
     */

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.abc(5);
        // Самый подходящий метон - где в параметрах инт, так как по умолчанию устанавливается инт в число.
        // Если этот метод закомментировать, то далее будет самый подходящий первый с вышестояющий - long. Тогда инт сконвертируется в больший тип лонг и выведется лонг
        // Если закомментировать метод с лонгом, то останется байт. и будет ошибка компиляции, так как для меньшего типа нужно кастовать, чтобы инт преобразовался в байт, тогда будет работать.
        t3.ghi(10, 66);
        def(50);
    }
}
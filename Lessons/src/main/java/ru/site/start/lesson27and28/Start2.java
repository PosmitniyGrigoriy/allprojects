package ru.site.start.lesson27and28;

import java.io.*;

public class Start2 {
}

/**
 * Введение в io
 *
 * Класс File - абстрактная репрезентация пути к файлу или папке.
 * Указать в параметрах файл, путь или путь + файл.
 *
 * Класс FileInputStream предназначен для создания потока с помощью которого можно читать информацию из источника.
 * Указать в параметрах переменную класса файл, в которой файл, путь или путь + файл.
 * Метод reat().
 *
 * Класс FileOutputStream предназначен для создания потока, с помощью которого можно писать информацию в источник.
 * Метод write().
 *
 * Кэнстрактэ классов FileInputStream и FileOutputStream могут выбрасывать исключение FileNotFoundException.
 *
 * Методы read() и write() классов FileInputStream и FileOutputStream могут выбрасывать исключение IOException.
 *
 * Когда стрим отработал, закрывать стрим. Например, если 2 стрима, чтение и запись, если чтение отработало, то закрывать поток чтения через close().
 *
 *
 */
class Test2 {
    public static void main(String[] args) throws Exception {

        // Если файла нет по этому пути, то компиляционной ошибки не будет, так как это абстрактная репрезентация и иксепшина во время райн тайм баиндин тоже не будет

//        File file1 = new File("test.txt");
//        File file2 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\");
        File file3 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\test1.txt");

        FileInputStream fileInputStream = new FileInputStream(file3);

        // При написании строки File нет ошибок.
        // При написании строки FileOutputStream будет ошибка сначала на пустых скобках с параметрами.
        // Если туда дописать переменную класса File, то будет компиляционная ошибка после new на слове
        // FileInputStream, так как может появиться ошибка при запуске. Файл или путь может не существовать.
        // Нужно пробрасывать исключение на уровне метода или делать try, catch.

        fileInputStream.read();

        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        fileOutputStream.write(100);

        System.out.println(fileInputStream);
        System.out.println(fileOutputStream);

    }
}

/**
 * Исключения
 *
 * Иерархия классов
 *
 * Object, ниже Throwable (переводится как способный быть выброшенный). Этот класс и его саб-классы могут быть выброшены.
 * У класса Throwable есть саб-классы: Exception и Error.
 * У классов Exception и Error есть саб классы.
 *
 * У класса Exception один из главных саб-классов - RunTimeException. У RunTimeException есть свои саб-классы.
 *
 * У класса Exception есть саб-класс IOException, а у класса IOException есть саб-класс FileNotFoundException.
 *
 * У класса RunTimeException есть саб-класс ArrayIndexOfBoundException, NullPointerException.
 */

class Test3 {
    public static void main(String[] args) {

        int array[] = {3, 6, 1};
        System.out.println("Hello 111");
        try {
            System.out.println(array[5]);
            System.out.println("Hello 222");
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        }
        System.out.println("Hello 333");

        // Иксепшины ArrayIndexOfBoundException и NullPointerException не нужно ловить и обрабатывать. Нужно код поправить.

    }
}

class Test4 {
    public static void main(String[] args) {
        File file3 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\test1.txt");
        System.out.println("Hello 111");
        try {
            FileInputStream fileInputStream = new FileInputStream(file3);
            System.out.println("Hello 222");
        } catch (FileNotFoundException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } catch (NullPointerException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } catch (ArrayIndexOutOfBoundsException | ArrayStoreException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } finally {
            System.out.println("Конец");
        }
        System.out.println("Hello 333");

        // Иксепшин FileNotFoundException нужно ловить
   }
}

/**
 * 1. Можно писать try + catch (1 или несколько) + finally. try и finally может быть 1, а catch как один, так и несколько. В catch можно писать как 1 иксепшин, так и несколько через оператор или (одинарный)
 * 2. Можно писать try + finally.
 * 3. Если в try коде указан класс, который может выбрасывать кисепшин (например, FileInputStream),
 * то нельзя писать try без catch. Нужно try + catch. По желанию finally. Если в try нет класса, который
 * выбрасывает иксепшин, то можно писать try с catch или try с finally.
 * 4. Последовательность должна быть такой: try, catch, finally. Нельзя finally поставить до catch или до try и так далее.
 * Нельзя писать код межу этими блоками.
  */

/**
 * Саб-классы RunTimeException еще называют unchecked exceptions.
 *
 * Данные иксепшины не нужно обрабатывать, так как это код неправильно написан. Например, к таким иксепшинам
 * относится NullPointerException. Обработка - это try + catch, а объявление - это к когда в конце метода
 * дописывается throws NullPointerException
 */

class Test5 {
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } finally {
            System.out.println("Конец");
        }
        System.out.println("Hello 333");
    }
}

class Test6 {
    public static void main(String[] args) throws NullPointerException {
        String text = null;
        System.out.println(text.length());
        System.out.println("Конец");
    }
}

class Test7 {

    public static void abc() throws NullPointerException {
        String text = null;
        System.out.println(text.length());
    }

    public static void main(String[] args) {
        abc();
        System.out.println("Конец");
    }
}

// Классы выше (тест 5-6-7) так обрабатывать и объявлять иксепшины нельзя. Нужно код исправлять, чтобы таких иксепшинов не было.

/**
 * Саб-классы Exception еще называют checked exceptions.
 *
 * Checked исключения указывают на часть кода, который находится за пределами непосредственного контроля
 * программой и который может являться причиной выбора иксепшинов. Такие ошибки в основном возникают
 * с внешними источниками (работа с файлами, бд, сетью).
 * Компилятор всегда проверяет возможность выбора checked исключений.
 *
 * checked exceptions нужно обраватывать через catch или объявлять через throws ... (на первой строке метода)
 */

// Ниже будет пример как сначала иксепшин объявляется, затем обрабатывается

class Test8 {

    public static void abc() throws FileNotFoundException { // Объявлен иксепшин
        File file3 = new File("test.txt");
            FileInputStream fileInputStream = new FileInputStream(file3);
    }

    public static void main(String[] args) {
        try { // метод abc, который может выбросить иксепшин взят в блоки try и catch
            abc();
        } catch (FileNotFoundException ex) { // обработан иксепшин
            System.out.println("Был пойман иксепшин: " + ex);
        }
        System.out.println("Конец");
    }

}
    // На верхнем или далее на нижних уровнях можно объявлять иксепшины, но в самом конце где-то нужно обработать иксепшин, чтобы не было ошибки в коде
// Если в сигнатуре метода указано throws ... , то когда будет вызываться метод abc там нужно будет сделать try и catch. без этого будет ошибка, что не обработано исключение.

    /**
     * Когда создается объект  FileInputStream fileInputStream = new FileInputStream(file3);
     * Может выброситься иксепшин, поэтому нужно указывать или самый низкий класс или более высокий
     * Низкий класс - FileNotFoundException.
     * Более высокий класс - IOException. FileNotFoundException - это саб-класс IOException.
     * Также можно написать еще более высокий класс Exception. Но лучше всегда писать самый ближайший класс.
     * В данном случае - это FileNotFoundException.
     *
     * С обоими вариантами будет работать.
     */

class Test9 {

    void abc() {
        int[] array = {5, 4};
        System.out.println(array[66]);
    }

    void def() {
        abc();
    }

    public static void main(String[] args) {
        Test9 t9 = new Test9();
        t9.def();
    }

}

/**
 * Результат вывода:
 *
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 66 out of bounds for length 2
 * 	at ru.site.start.lesson27and28.Test9.abc(Start2.java:219)
 * 	at ru.site.start.lesson27and28.Test9.def(Start2.java:223)
 * 	at ru.site.start.lesson27and28.Test9.main(Start2.java:228)
 *
 * 	Выше в описании написан стэк трэйс. Путь как двигался иксепшин (по каким классам он передавался).
 * 	Откуда куда переходил иксепшин. Сначала идет сверху-вниз, затем снизу-вверх. и возвращается методу
 * 	abd() иксепшин, так как ранее иксепшин не был обработан.
 *
 * 	Стэк-трэйс читать снизу-вверх. Иксепшин сначала появится в main, затем не обработался и передался
 *  методу def(), там тоже не обработался и передался методу abc(). Там тоже не обработался
 *  и вывелся иксепшин.
 *
 * 	Вызывался метод def в мэин и получил иксепшин. Он передал иксепшин методу def, затем метод
 * 	def передал иксепшин методу abc, а у метода def не оказалось обработки исключения, поэтому и
 * 	появился иксепшин.
 */

class Test10 {

    public static void abc() throws FileNotFoundException { // Объявлен иксепшин
        File file3 = new File("test.txt");
        FileInputStream fileInputStream = new FileInputStream(file3);
    }

    public static void main(String[] args) {
        try { // метод abc, который может выбросить иксепшин взят в блоки try и catch
            abc();
        } catch (FileNotFoundException ex) { // обработан иксепшин
            System.out.println("1 вариант вывода иксепшина: " + ex); // java.io.FileNotFoundException: test.txt (Не удается найти указанный файл)
            System.out.println("2 вариант вывода иксепшина: " + ex.getMessage()); // test.txt (Не удается найти указанный файл)
            System.out.println("3 вариант вывода иксепшина: " + ex.getLocalizedMessage()); // test.txt (Не удается найти указанный файл)
            System.out.println("4 вариант вывода иксепшина: " + ex.getCause()); // null - разобраться почему не пишется и как починить, чтобы вывелось в читабельном виде
            System.out.println("5 вариант вывода иксепшина: " + ex.getSuppressed()); // [Ljava.lang.Throwable;@6442b0a6 - не понятно здесь что написано. разобраться почему не пишется и как починить, чтобы вывелось в читабельном виде
            System.out.println("6 вариант вывода иксепшина: " + ex.getStackTrace()); // [Ljava.lang.StackTraceElement;@edf4efb - не вывелся в читабельм виде стэк трэйс. разобраться почему не пишется и как починить, чтобы вывелось в читабельном виде
        }
        System.out.println("Конец");
    }

}

/**
 * Если код может выдать иксепшин, то обрабатывать через catch. И всегда так делать.
 * Если не понятно как обработать, то пробрасывать иксепшин через сигнатуру метода throws ...
 */

/**
 * Ниже тема Error
 */

class Test11 {
    static void abc() {
        System.out.println("Сообщение");
        abc();
    }
    public static void main(String[] args) {
        abc();
    }
}
/**
 * Сначала будет выводить сообщение, вывод, вывод, вывод и заканчивается папять однажды:
 *
 * Сообщение
 * Сообщение
 * Сообщение
 * Сообщение
 * Сообщение
 * Сообщение
 * Exception in thread "main" java.lang.StackOverflowError
 * 	at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
 * 	at java.base/java.io.PrintStream.write(PrintStream.java:605)
 * 	at java.base/java.io.PrintStream.print(PrintStream.java:745)
 * 	at java.base/java.io.PrintStream.println(PrintStream.java:882)
 * 	at ru.site.start.lesson27and28.Test11.abc(Start2.java:288)
 * 	at ru.site.start.lesson27and28.Test11.abc(Start2.java:289)
 * 	at ru.site.start.lesson27and28.Test11.abc(Start2.java:289)
 * 	at ru.site.start.lesson27and28.Test11.abc(Start2.java:289)
 * 	at ru.site.start.lesson27and28.Test11.abc(Start2.java:289)
 *
 * 	Стэк переполнился и появился error.
 *
 * 	Error и RunTimeException не пробрасывать и не обрабатывать никогда.
 *
 * 	Error тоже считаются unchecked.
 */

/**
 * Если указывать несколько блоков catch(), то указывать можно разные иксепшины, если они не связаны друг с другом
 * Если они связаны друг с другом (саб-класс и родительский класс), то сначала нужно указывать саб-класс,
 * затем родительский класс. Тогда зайдет в первый catch (где саб-класс), а во второй catch (где родительский класс)
 * уже не зайдет, так как иксепшин был пойман и обработан. А если будет родительский, и после саб-класс, то
 * будет ан ричибл стэйтмэн. Так как в первый класс программа зайдет (catch), а во второй нет.
 *
 * Пример ниже.
 */

// Так писать можно
class Test12 {
    public static void main(String[] args) {
        File file3 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\test1.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file3);
            System.out.println("Hello 222");
        } catch (FileNotFoundException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } catch (NullPointerException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } finally {
        }
    }
}

// Так тоже писать можно. Поменял блоки catch местами
class Test13 {
    public static void main(String[] args) {
        File file3 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\test1.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file3);
            System.out.println("Hello 222");
        } catch (NullPointerException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } catch (FileNotFoundException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        } finally {
        }
    }
}

// Так писать нельзя. IOException родительский класс, а ниже указан саб-класс. Туда уже не зайдет программа. ПОэтому указать только главный класс.
class Test14 {
    public static void main(String[] args) {
        File file3 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\test1.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file3);
            System.out.println("Hello 222");
        } catch (IOException ex) {
            System.out.println("Был пойман иксепшин: " + ex);
        }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Был пойман иксепшин: " + ex);
//        } finally {
//        }
    }
}

// Так писать можно. Сначала указыавется саб-класс, затем во втором catch главный класс.
class Test15 {
    public static void main(String[] args) {
        File file3 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\test1.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file3);
            System.out.println("Hello 222");
        } catch (FileNotFoundException ex) {
            System.out.println("Был пойман иксепшин 1: " + ex);
        } catch (IOException ex) {
            System.out.println("Был пойман иксепшин 2: " + ex);
        } finally {
        }
    }
}

// Результат вывода: Был пойман иксепшин 1: java.io.FileNotFoundException: путь\test1.txt (Не удается найти указанный файл)
// Второй catch бесполезен, так как иксепшин был пойман первым catch, и обработан, поэтому второй catch не будет работать.

// unchecked - анчЕкт - непроверенный
// throwable - фровбл бросаемый

// в блоке finally пишется подчищающий код. например, закрытие потока. close().

/**
 * Ловить конкретный иксепшин, чтобы только его обрабатывать. Если ловить общий иксепшин Exception, то будет общая обработка,
 * а не обработка конкретного иксепшина, что плохо.
 *
 * finally блок выполняется, если в try или catch есть return
 */

class Test16 {

    static int abc() {
        try {
            File file3 = new File("C:\\Java\\workspace\\My-training-projects-part-1\\Lessons\\src\\main\\java\\ru\\site\\start\\lesson27and28\\test1.txt");
            FileInputStream fileInputStream = new FileInputStream(file3);
            return 5;
        } catch (FileNotFoundException ex) {
            System.out.println("Был пойман иксепшин 1: " + ex);
            return 8;
        } finally {
            System.out.println("Конец");
            return 33;
        }
//        return 44; // На этой строке уже анричибл стэйтмэнт. Сработает ритен в файнали блоке и дальше не пойдет, поэтому ниже ритен не выполнится.
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}

/**
 * Результат вывода:
 * Был пойман иксепшин 1: ...
 * Конец
 * 33
 */

/**
 * finally блок не выполнится, если программа будет завершена через System.exit в try или catch,
 * или если будет крушение JVM или операционной системы.
 *
 * finally блок не выполняется в через чур экстренных случаях.
 *
 * Если return имеется в catch и finally блоке, то аутпутом будет возвращаемое значение из finally блока.
 */

/**
 * Если иксепшин не ран тайм, а обычный, то это чект иксепшин. ЕГо нужно обрабатывать или пробрасывать.
 *
 * Выписать класс иксепшинов, которые относятся к ран тайм иксепшинам и к обычным, чтобы понимать в каких случаях нужно
 * пробрасывать иксепшины или обрабатывать, а когда это делать не нужно.
 *
 * Если return в catch блоке возвращает примитивный тип данных, то  его нельзя изменить в finally блоке.
 * Если return в catch блоке возвращает рефренс тип данных (СтринБилде), то его можно и зменить в finally блоке.
 * Тоже для другого рефрефс типа. Главное, чтобы было mutable.
 *
 * Исключение может быть переброшено. Это обычно делают, когда код текущего метода обработал
 * исключение не полностью и выбрасывает его вновь, чтобы метод, который будет вызывать
 * текущий метод завершил обработку исключения.
 *
 * Можно использовать вложенные блоки try, catch, finally, как во вложенных фор и иф.
 */

class Test17 {
    void abc() {
        int[] array = {1, 5, 9};
        try {
            System.out.println(array[55]);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        } catch(NullPointerException ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        Test17 test17 = new Test17();
        test17.abc();
    }
}

// Код в классе Test17. В try идет обращение к индексу 55, такого нет. Это выход за пределы массива.
// Для этой ситуации подойдут первый catch. Второй бесполезен. Не появится. так что нет смысла писать его.

class Test18 {
    void abc() {
        int[] array = {1, 5, 9};
        try {
            System.out.println(array[33]);
        } catch(ArrayIndexOutOfBoundsException ex) {
            String text = null;
            System.out.println(text.length());
        } catch(NullPointerException ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        Test18 test18 = new Test18();
        test18.abc();
    }
}

// Если в классе Test18 написать два раза catch, то они оба относятся к первому try. А то, что внутри первого catch
// будет NullPointer, чтобы его обработать нужно внутри catch писать try, catch. Пример в Test19

class Test19 {
    void abc() {
        int[] array = {1, 5, 9};
        try {
            System.out.println(array[33]);
        } catch(ArrayIndexOutOfBoundsException ex) {
            String text = null;
            try {
                System.out.println(text.length());
            } catch(NullPointerException ex2) {
                System.out.println(ex2);
            }
        } catch(NullPointerException ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        Test19 test19 = new Test19();
        test19.abc();
    }
}

// Ниже создаются свои иксепшины

class PodvernutbNogyException extends Exception {
    PodvernutbNogyException(String message) { // У класса Exception есть кэнстрактэ с параметром строка, поэтому можно создать такой кэнстрактэ и передать туда строку
        super(message); // Затем вызывается этот кэнстрактэ и туда передается значение строки
    }
    PodvernutbNogyException() { // Если нужен иксепшин без сообщения, то использовать второй вариант
        super();
    }
}

class SveloMishichyException extends RuntimeException {
    SveloMishichyException(String message) {
        super(message); //
    }
    SveloMishichyException() {
        super();
    }
}

//class Test20 {
//    void marafon(int airTemperature, int runningSpeed) { // Так как указываем свой иксепшин, который наслудуется классом Exception, он чект иксепшин, его нужно пробрасывать или обрабатывать, если это не сделать, то на строке throw new ... будет компиляционная ошибка
//        if(runningSpeed > 12) {
////            throw new PodvernutbNogyException("ddd");
//        }
//    }
//}

class Test20 {
    void marafon(int runningSpeed, int airTemperature) throws PodvernutbNogyException {
        if(runningSpeed <= 12 && airTemperature <= 32) {
            System.out.println("Вы пробежали марафон");
        }
        if (runningSpeed > 12) {
            throw new PodvernutbNogyException("Скорость бега была больше 12. Скорость: " + runningSpeed);
        }
        if (airTemperature > 32) {
            throw new SveloMishichyException(); // Так как у класса SveloMishichyException наследование ран тайм иксепшин, это анчект иксепшин, то пробрасывать и обрабатывать не нужно
        }
    }

    // v1
//    public static void main(String[] args) throws PodvernutbNogyException { // Дописать  throws PodvernutbNogyException, чтобы не было ошибки при вызове метода marafon, так как иксепшин был проброшен, а не обработан выше (в методе марафон)
//        Test20 test20 = new Test20();
//        test20.marafon(10, 10); // Выведется пустота
//        test20.marafon(20, 10); // Будет наше сообщение и ниже стэк стрэйс
//        test20.marafon(10, 40); // Выведется стэк стэйс по второму аргументу
//    }

    // v2
    public static void main(String[] args) {
        Test20 test20 = new Test20();
        try {
            test20.marafon(10, 10); // Выведется пустота
            test20.marafon(20, 10); // Будет наше сообщение и ниже стэк стрэйс
            test20.marafon(10, 40); // Выведется стэк стэйс по второму аргументу
//        }
        } catch (PodvernutbNogyException | SveloMishichyException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Вы получите грамоту!");
        }
    }
}

// Создавать исключения, которые наследуются от Exception или RuntimeException. Когда что из этого нужно выбирать?
// Если не указать в наследовании Exception или RuntimeException, то будет компиляционная ошибка.
// Чтобы выбрасывать свои ошибки нужно указывать наследование класса Exception или RuntimeException.


/**
 * Распространенные саб-классы RuntimeException
 * 1. ArrayIndexOutOfBoundsException - когда обращаемся к индексу меньше нуля или больше размера массива
 * 1.1. IndexOutOfBoundsException - это аналог первого иксепшина, только для коллекции.
 * 2. ArithmeticException - когда делим на нуль.
 * 3. ClassCastException - когда два класса не имеют связи и второй кастуется под первый.
 * 4. IllegalArgumentException - когда в параметры метода неправильно написан аргумент. Чтобы вывести какое-то сообщение свое,
 * если аргумент не правильно указан, то можно использовать этот готовый иксепшин. Пример будет ниже.
 * 5. IllegalStateException - когда метод вызывается в не подходящее время. Пример будет ниже.
 * 6. NullPointerException
 * 7. NumberFormatException - наследник IllegalArgumentException.
 * Если будет указано Integer.parseInt("44оп"); , то будет этот иксепшин, так как в параметры нужно было
 * указать число, а не буквы. Тогда буквы строчные перевелись бы в число.
 * Если будет указано Integer.parseInt("44оп", 16); Переводится в шестнадцатеричную систему счисления,
 * тогда проходит и конвертируется.
 */

class Test21 {

    public static void createPassword(String password) {
        if (password.length() < 6) {
            throw new IllegalArgumentException("Пароль должен быть от 6 символов.");
        }
    }

    public static void main(String[] args) {
        createPassword("123");
    }
}

/**
 * Результат вывода:
 * Exception in thread "main" java.lang.IllegalArgumentException: Пароль должен быть от 6 символов.
 * at ru.site.start.lesson27and28.Test21.createPassword(Start2.java:616)
 * at ru.site.start.lesson27and28.Test21.main(Start2.java:621)
 */

class Test22 {

    static String sostoyanie = "в ожидании"; // в ожидании, в воздухе, полет отменен

    public static void letet() {
        sostoyanie = "в воздухе";
        System.out.println("Самолет летит");
    }

    public static void ojidat() {
        if (sostoyanie.equals("в воздухе")) {
            throw new IllegalStateException("Самолет уже в воздухе");
        }
        sostoyanie = "в ожидании";
        System.out.println("Самолет в ожидании");
    }

    public static void otmenitPolet() {
        if (sostoyanie.equals("в воздухе")) {
            throw new IllegalStateException("Самолет уже в воздухе");
        }
        sostoyanie = "полет отменен";
        System.out.println("Полет самолета отменен");
    }

    public static void main(String[] args) {
        ojidat();
        letet();
        otmenitPolet();
    }

}

/**
 * Распространенные саб-классы Error:
 * 1. ExceptionInInitializerError - является наследником класса LinkegeError. Эта ошибка появляется, когда
 * в статическом инициализаторе во время ран тайм появилась ошибка.
 * static {
 *    int result = Integer.parseInt("44оп");
 * }
 * // Выбрасывается NumberFormatException, так как здесь буквы указаны, но так как это внутри стэтик
 * инициализатора, то будет ошибка ExceptionInInitializerError. Что внутри статического инициализатора
 * была обнаружена ошибка.
 *
 * Также ошибка ExceptionInInitializerError будет появляются когда любой статический контекст используется.
 * Например, две строки ниже.
 * static String text = null;
 * static int a = text.length();
 * Здесь text статический и равен нал. затем получаем длину. будет нал поинтер. и это передается в стэтик а.
 * И ошибка ExceptionInInitializerError. Также эта ошибка была бы у статического метода, если бы
 * внутри этого метода появилась бы ошибка.
 *
 * 2. StackOverFlowError - наследник VirtualMachineError. Это связано с рекурсией. Когда создается много объектов.
 * 3. OutOfMemoryError - наследник VirtualMachineError. Когда память у джава виртуальной машины закончится,
 * то не получится больше создавать новые объекты.
 * 4. NoClassDefFoundError - является наследником класса LinkegeError. Джава не может найти
 * какой-то класс ран тайм уже во время запуска программы.
 */

/**
 * Исключения, переопределенные методы, перегруженные методы, кэнстрактэ
 *
 * Если класс перезаписывает метод из супер класса или имплементирует методы из интерфейса
 * нельзя добавлять в его сигнатуру новые чект исключения. Можно в сигнатуре метода использовать
 * только исключения из перезаписанного метода супер класса или дочерние классы данных иссключений.
 * Пример. Если метод может выбросить throws IOException, то можно указать или этот вариант или тот, которые меньше
 * ниже уровнем. Например, FileNotFoundException. Нельзя указать иксепшин в throw, который выше
 * IOException. Например, Exception или другой какой-то.
 *
 * Пример ниже.
 */

class Test23 {
    public static void main(String[] args) {
        Animal2 a = new Mouse2();
        try {
            a.run();
        } catch (IOException ex)  {
            System.out.println("Иксепшин пойман");
        }
    }
}

class Animal2 {
    void run() throws IOException {
        System.out.println("Энимал ран");
    }
}

class Mouse2 extends Animal2 {
    void run() throws IOException { // Так писать можно. Указан первичный иксепшин.
//    void run() throws FileNotFoundException { // Так писать можно. Указан более низкий иксепшин
//    void run() throws Exception { // Так писать нельзя. Здесь указать более высокий иксепшин
        System.out.println("Энимал ран");
    }
}

/**
 * Если указать первичный иксепшин или более низкий, то будет работать. А если более высокий,
 * например, Exception, то будет ошибка компиляции, так как когда пишется строка
 * Animal2 a = new Mouse2(); метод run ищется в классе Animal2 и находится. Там throws IOException
 * А потом смотрит объект какого класса будет создан. new Mouse2(); и делает переопределение,
 * но у переопределенного метода может быть такой же иксепшин указан или более низкий. А не более высокий
 * Если более высокий будет, то нужно было в Animal2 указывать более высокий иксепшин и в catch
 * указывать тоже более высокий иксепшин.
 *
 * Если будет как код выше, только будет перегруженные методы, то можно писать большего уровня иксепшин.
 *
 * Кэнстрактэ может выбрасывтаь исключвения.
 * Кэнстрактэ в сигнатуре должен описывать все исключения кэнстрактэ супер класса, который он
 * вызывает. Может описывать супер классы данных исключений, а также добавлять новые исключения.
 *
 * Кэнстрактэ с пробросом иксепшина ведут себя противоположно перезаписанным методам.
 */

class Animal3 {
    Animal3() throws FileNotFoundException {}
}

//class Mouse3 extends Animal3 {} // Если так написать, то будет компиляционная ошибка, так как не закрыта срока выброса иксепшина

//class Mouse3 extends Animal3 {
//    Mouse3() { super(); }  // Если так написать, то тоже будет такая же ошибка
//    Mouse3() throws FileNotFoundException { super(); } // А так уже иксепшин проброшен, и ошибки нет.
//    Mouse3() throws FileNotFoundException { } // Так тоже можно писать. Ошибки не будет.
//}

/**
  * Если в основном классе у кэнстрактэ проброшен иксепшин и если есть класс наследник, то там нужно
  * в кэнстрактэ пробрасывать тоже иксепшин.
 * Также кэнстрактэ в классе, которые наследует верхний клас можно указывать более широкий (верхний иксепшин),
 * а в перегруженных методах так нельзя было делать.
 */

// В throw и trows можно указывать иксепшины анчект, которые появляются во время ран тайм. Но их указывать не стоит

// Если в теле кэнстрактэ идет бросание иксепшина, то в сигнатуре кэнстрактэ указывать иксепшин. Когда будет создаваться объект этого кэнстрактэ, то нужно обрабатывать или пробрасывать.

// Если есть метод satic void abc() {} и потом где-это этот метод вызывается и обрабатывается, то будет ошибка. Так как обрабатывать здесь не нужно. не будет иксепшна во время работы метода.

// Test 1
class T1 {
    static String str = "";

    void ghi() throws Exception {
        throw new Exception();
    }

    void def() throws Exception {
        ghi();
        str += "2";
        ghi();
        str += "3";
    }

    void abc() {
        try {
            def();
        } catch (Exception e) {
            str += "1";
        }
    }

    public static void main(String[] args) {
        T1 t = new T1();
        t.abc();
        System.out.println(str);
    }
}

// Результат вывода: 1.
// Когда первый раз встречатся иксепшин, он идет в обратную сторону и выводит 1, и повторно не идет уже.


// Test 2
// Какие из этих классов представляют собой unchecked исключения?
// A) CompilationException
// B) NumberException
// C) NullPointerException
// D) Throwable
// E) StackOverflowException
// F) RuntimeException
// G) ArrayIndexOutOfBoundsException
// H) IllegalArgumentException
// I) MemoryOutOfBoundsException
// J) CheckedException

// Важно: разные варианты выше не существуют. A, B, E, I, J
// Правильные варианты: С, F, G, H
// D - чект иксепшин.

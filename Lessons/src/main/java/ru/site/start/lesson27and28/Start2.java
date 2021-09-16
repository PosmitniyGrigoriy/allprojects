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

// unchecked - [?n??ekt] - анчЕкт - непроверенный
// throwable - фровбл бросаемый

// в блоке finally пишется подчищающий код. например, закрытие потока. close().

/**
 * Ловить конкретный иксепшин, чтобы только его обрабатывать. Если ловить общий иксепшин Exception, то будет общая обработка,
 * а не обработка конкретного иксепшина, что плохо.
 */







// Далее смотреть второе видео с самого начала и записывать заметки



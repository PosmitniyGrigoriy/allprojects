package ru.site.start.lesson29;

import java.text.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Start {
    public static void main(String[] args) throws ParseException {

        // 1 часть: заметки для работы с классом Date
        /**
         * Можно написать строку: Date date = new Date();
         * Далее вызывать метод setTime и указать значение самое длинное и в конце дописать L: 1589286650000L
         * Потом можно вывести в сауте date. и будет Tue May 12 22:30:50 VLAT 2020
         * Также есть метод date.getTime() . Он выводит значение в милисекундах (длинное число) какой-то даты.
         * Также можно лонговое значение указывать в параметры new Date() и сразу выводить в саут или сохрарять
         * в переменную типа Date.
         *
         * Пример кода ниже:
         */
//        Date date = new Date(1589286650000L); // v1: выведется в сауте по переменной date Tue May 12 22:30:50 VLAT 2020
//        Date date = new Date(); // v2
//        date.setTime(1589286650000L); // v2
//        System.out.println(date); // v2 Tue May 12 22:30:50 VLAT 2020
//        System.out.println(date.getTime()); // 1589286650000
        /**
         * Date date = new Date();
         * Если в параметры написать год, месяц, день или часы еще, то часы правильно выведет, а год, месяц и день
         * не правильно. Не понятно почему.
         *
         */
        // Для параметров ниже - год указывается не 2020, а 120, так как вычетаем 1900, а месяц начинает индекс с 0, а не 1. Может и для других значений тоже особенности есть
//        Date date2 = new Date(120, 5, 12); // Вывод: Fri Jun 12 00:00:00 VLAT 2020 // Год, месяц, день.
//        System.out.println(date2);
//        Date date2 = new Date(120, 5, 12, 15, 30, 50); // Вывод: Fri Jun 12 15:30:50 VLAT 2020 // Год, месяц, день, часы, минуты, секунды
//        System.out.println(date2);
        // В году добавляется сразу 1900, поэтому нужно не 2021 писать или 2021, а 120, чтобы 120 + 1900 = 2020 год.

//        Date date3 = new Date();
//        System.out.println(date3); // Thu Aug 26 23:26:19 VLAT 2021
//        date3.setYear(110);
//        System.out.println(date3); // Thu Aug 26 23:26:19 VLAST 2010
//        System.out.println(date3.getYear() + 1900);

        // В примере выше (в коде). Там можно вызывать разные сеттеры. и сетить год, месяц, день, часы, минуты, секунды
        // Также есть геттеры.
        // Важно: это устарелые методы, и их лучше не использовать.
        // Но если они будут использоваться, то для сета года нужно писать число с вычетом 1900. Для 2010 году указать 110,
        // Так как 2020-1900=110 - это и писать. А для гет года - там нужно добавить + 1900, чтобы получить 2010.

        // Есть метод before (до) и after (после). Это булиэн. Первая дата до второй даты или первая дата после второй даты?
        // Также есть метод equals и compareTo (сравнивают два объекта)

//        Date date5 = new Date(120, 5, 12);  // Вывод: Fri Jun 12 00:00:00 VLAT 2020 // Год, месяц, день.
//        Date date6 = new Date(120, 5, 12, 15, 30, 50); // Вывод: Fri Jun 12 15:30:50 VLAT 2020 // Год, месяц, день.
//        System.out.println(date5.after(date6)); // false
//        System.out.println(date5.before(date6)); // true

//        System.out.println(date5.compareTo(date6)); // -1 // Первая дата меньше второй, поэтому -1
//        System.out.println(date5.equals(date6)); // false // Первая дата и вторая разная по заполенным аргументам, поэтому false. Если был бы одинаковый формат, например, и там, и там был бы одинаковый год, месяц, день и больше ничего, то было бы true





        // 2 часть: заметки для работы с классом SimpleDateFormat
        // В этом классе и в других могут писать форматы времени. типа "yyyy-MM-dd'T'HH:mm:ss.SSSZ". Проще открыть класс и посмотреть формат и подобрать для себя нужный формат.

        // Этот класс можно использовать для форматирования даты. Чтобы дату вывести в том варианте, котором нужно.
//        SimpleDateFormat s = new SimpleDateFormat();
        // Пример кода, который форматирует дату указан в самом низу класса (Start).
        // Также у класса SimpleDateFormat есть разные методы для работы с датами, но пока не известно, как с ними работать. Лучше использовать старые варианты (примеры кода указаны в конце этого файла Start) или делать по уроку, используя LocalDate, LocalTime, LocalDateTime.

        // В конце файла есть пример кода. Там используется SimpleDateFormat. Сначала указывается формат в параметрах, затем вызываетс метод формат и в него ложится дата (Date) и это все сохраняется в строку. Затем создается снова объект SimpleDateFormat и уже используется метод парсер и указывается строка сохраненная и на выходе Date.





        // Часть 1: Date
//        Date date = new Date();
//        System.out.println(date); // Вывод: Sat Aug 28 15:40:02 VLAT 2021

        // Часть 2: Calendar
//        Calendar calendar = Calendar.getInstance(); // нельзя написать new Calendar(), так как кэнстрактэ приватный. Можно лиш вызывать экземпляр, как показано в примере.
//        calendar.setTime(date);
//        System.out.println(calendar); // Выводится много всяких данных, кроме стандартного вывода. Еще зона, эра и так далее.
//        System.out.println(calendar.getTime()); // Чтобы вывелась дата без дополнительных значений, дописать метод getTime()
//        calendar.add(Calendar.WEEK_OF_MONTH, 1); // Добавили 1 неделю к текущей дате. Здесь есть и другие опции на выбор, кроме недельного добавления даты
//        System.out.println(calendar.getTime()); //  Вывод: Sat Sep 04 15:40:02 VLAT 2021

        // Часть 3: DateFormat
//        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT); // Здесь также нельзя создать экземпляр через new. Можно лишь вызывать. Также во внутрь параметров можно положить сразу тип формата даты.
//        System.out.println(dateFormat.format(calendar.getTime())); // Вывод: 04.09.2021


        // Часть 4: SimpleDateFormat
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Указать формат даты. Можно еще время добавить HH:mm:ss
//        System.out.println(simpleDateFormat.format(calendar.getTime())); // 04/09/2021
//        Date newDate = simpleDateFormat.parse("05/12/1985");
//        System.out.println(newDate); // Thu Dec 05 00:00:00 VLAT 1985
        // Для части 4: создали на одной строке формат. Затем вызывали метод формат и положили в параметры готовую дату (Date). И вывелась дата в нужном формате.
        // Классы SimpleDateFormat и DateFormat нужны для форматирования даты





        // 3 часть: заметки для работы с классом Calendar
        /**
         * Класс календарь - это абстрактный класс, поэтому нельзя создать объект календаря, но вызывать экземпляр, как в примере ниже
         *
         * У класса календарь один наследник - GregorianCalendar. Можно создать объект по этому классу.
         *
         * Календарь - это свод правил, чтобы вычислить день, месяц, год или другое что-то по какому-то критерию.
         */
//        Calendar calendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();
        /** Два основных метода - set и get.
         * set() - первым аргументом передается параметр, который нужно установить, а вторым аргументом меняем этот параметр. Пример ниже.
         */

//        calendar.set(11, 1); // v1 Устанавливаем часы. Делаем час = 1 часу. Если сейчас 17 часов, то будет 1 час.
//        calendar.set(Calendar.HOUR_OF_DAY, 1); // v2
        // v1 и v2 устанавливают час. Делают равным час 1. Можно первый аргумент как числом указывать, так и через константу (инам). Результат одинаковый будет
//        System.out.println(calendar.getTime());
        // также у календаря есть специализированный метод set. Там можно устанавливать год месяц, дату, час, минуты, секунды. Можно еще без секунд указывать. Или просто дату указать (год, месяц, день)
//        calendar.set(2020, 0,05); // Месяца - от 0 по 11. Также может есть особенности по другим параметрам
//        calendar.set(2020, 0,05, 10,30,44);
//        System.out.println(calendar.getTime());
//        calendar.setTime(ЗДЕСЬ УКАЗАТЬ ПЕРЕМЕННУЮ КОТОРАЯ ТИПА Date); // Такой вариант тоже можно использовать
        // Ниже геттеры
//        System.out.println(calendar.getTime()); // Sat Aug 28 17:44:24 VLAT 2021
//        System.out.println(calendar.getCalendarType()); // gregory
//        System.out.println(calendar.getTimeZone()); // sun.util.calendar.ZoneInfo[id="Asia/Vladivostok",offset=36000000,dstSavings=0,useDaylight=false,transitions=67,lastRule=null]
//        System.out.println(calendar.get(Calendar.YEAR)); // 2021
//        System.out.println(calendar.get(Calendar.MONTH)); // 7
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 28
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // 240

        // Метод add. Первый параметр - туда вставляем параметр, который нужно поменять. Второй параметр - на сколько меняем. Например, указываем месяц и добавляем 1 к текущей дате. и выводим результат.
//        calendar.add(Calendar.MONTH, 1); // Первый параметр можно другой поставить. Есть на выбор разные.
//        System.out.println(calendar.getTime()); // Thu Oct 28 17:47:49 VLAT 2021 - добавился 1 месяц
//        calendar.add(Calendar.MONTH, -1); // Также можно отнимать
//        System.out.println(calendar.getTime()); // Sat Aug 28 17:49:42 VLAT 2021
//        calendar.clear(); // Очистка даты календаря. Ставит значение Thu Jan 01 00:00:00 VLAT 1970
//        System.out.println(calendar.getTime()); // Thu Jan 01 00:00:00 VLAT 1970

        // Выводит список зарегистрированных в джаве тайм зон для установки ее в календарь. Как устанавливать будет показано ниже, но не сразу прям снизу.
//        String[] arrayTimeZones = TimeZone.getAvailableIDs();
//        for(String result : arrayTimeZones) {
//            System.out.println(result);
//        }

        // Выводит список зарегистрированных локалей в джаве для установки ее в календарь.
//        Locale[] locales = Locale.getAvailableLocales();
//        for(Locale result : locales) {
//            // Обязательно вывод делать так: сначала по языку, затем по стране, затем варианты
//            // Это весь список
////            System.out.println(result.getDisplayLanguage() + "] - [" + result.getDisplayCountry() + "] - [" +
////                    result.getDisplayVariant());
//
//            // А по условию будет так. Если нужно варианты, только, где русские языки
//            if(result.getDisplayLanguage().equals("русский")) {
//                System.out.println(result.getDisplayLanguage() + "] - [" + result.getDisplayCountry() + "] - [" +
//                    result.getDisplayVariant());
//            }
//        }

        // Ниже будет строка, как установить тайм зону и локалиазацию
//        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"), new Locale("en"));
        // Тайм зона нужна, чтобы время правильно вывести. И чтобы, если меняется время На +1 или -1 час в году 1 раз, то , чтобы это делалось правильно.
        // Локаль нужна, чтобы правильно выставить первый день недели. Что это понедельник рабочий день - первый день. Вроде так про тайм зону и локаль.


        // Date и Calendar - два старых класса для работы с датами. Новые (удобные) - LocalDate, localTime, LocalDateTime.

        /** По этой ссылке можно посмотреть таблицу, в которой показано какие классы есть для работы с датами и временем.
         * Показано какие классы работают только с датой, а другие с временем, другой только с годом, а еще другой только с месяцем,
         * а какие классы могут работать с тайм зоной.
         *
         * https://docs.oracle.com/javase/tutorial/datetime/iso/overview.html
         *
         * А это общая ссылка. Там можно другие страницы из документации еще почитать.
         *
         * Например, на этой странице написано какие методы есть и что они делают:
         * https://docs.oracle.com/javase/tutorial/datetime/overview/naming.html
         */

        // Метод of - создает дату
        // Метод from - берет откуда-то дату и немного меняет ее формат. Например, с полной (год, месяц, день, часы, минуты, секунды) и делает год, месяц, день.
        // Метод parse - берет строку и конвертирует ее в дату в формат LocalDate или LocalTime или LocalDateTime.
        // Метод format - указывается формат и форматируется дата
        // Методы гет (их много). Вывести день месяца, день недели, час, милисекунды, минуты, месяц и так далее.
        // Методы is... - для сравнения.
        // Методы with - вернуть копию объекта с какими-то изменениями.
        // Методы plus и minus - прибавить и отнять от даты или времени что-то.

        /**
         * Важно: объекты, созданные новыми классами LocalDate, localTime, LocalDateTime. считаются не изменяемыми.
         * Если указана первая дата и от нее отнимается 1 месяц, то создается второй объект и потом выводится вторйо объект, а не первый.
         * Первый объект останется не измененным.
         */

        /**
         * sql.Date сохраняет дату в секундах или милисекундах, а не в дате.
         * Если в базе данных сохраняется в дате, а используется localdate, то это уже другой тип данных
         * и нужно преобразовать один тип в другой. В обе стороны можно конвертацию делать. Пример кода ниже.
         * Но чтобы не было компиляционных ошибок, класс нужно вставить за мэин.
         */
//        public static class DateUtils {
//
//            public static Date asDate(LocalDate localDate) {
//                return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
//            }
//
//            public static Date asDate(LocalDateTime localDateTime) {
//                return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
//            }
//
//            public static LocalDate asLocalDate(Date date) {
//                return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
//            }
//
//            public static LocalDateTime asLocalDateTime(Date date) {
//                return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
//            }
//        }


        /**
         * В базе данных в основном хранят дату и время в этих трех вариантах, но могут быть и другие.
         * Date, Time, Timestamp.
         */

        // Параметры для создания формата даты (часы, минуты, секунды, эра, и так далее, можно посмотреть по этой
        // ссылке: https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar







        // 4 часть: заметки для работы с классами (это новые классы) LocalDate, LocalTime, LocalDateTime
        /**
         * В уроке будет информация просто по классам и методам. Без часовых поясов.
         *
         * Класс LocalDate содержит информацию о дне: год, месяц, день.
         * Класс LocalTime содержит информацию о времени: час, минута, секунда, наносекунда. наносекунда - миллиардная доля секунды.
         * Класс LocalDateTime содержит информацию о дне и времени: год, месяц, день, час, минута, секунда, наносекунда.
         *
         * Эти классы в пэкэджэ java.time.*
         *
         * Класс дня используется, если важен только день. Например, 8 марта 2021.
         * Класс времени используется, если важно только время. Например, 13:00 - это время обеда.
         * Класс дня и времени используется, если важна дата и время. Такого-то дня и в такое-то время будет такое-то событие.
         *
         * Данные 3 класса имеют стэтик метод now(), который возвращает объекты с текущими значениями.
         */

//        System.out.println(LocalDate.now()); // 2021-08-28 - по умолчанию выводит год, месяц, день, а не день, месяц, год
//        System.out.println(LocalTime.now()); // 23:44:48.295180700
//        System.out.println(LocalDateTime.now()); // 2021-08-28T23:44:48.296180300 - дата и время разделены символом Т

        // Когда в сауте что-то указывается, это всегда конвертируется в строку. Напишем toString() или не напишем - всегда будет конвертация в строку.

        // Выше было три метода новых. У каждого метода прайвэт кэнстракте. Нельзя создать экземпляр (объект). Нельзя написать после равно new ... Можно лишь вызывать метод. Как показано будет ниже в примере.
//        LocalDate ld1 = new LocalDate(2014, 5, 15); // Так писать нельзя.

        // Ниже будет код с автомобилем. По аналогии написан код для тех трех классов по дате, пэтому нельзя создать объект самому по дате, а можно лишь вызывать метод, который создаст объект даты.
        // Если раскомментировать код, то будут компиляционные ошибки. Чтобы их не было, нужно этот код вынести за пределы класса, за мэин.

//class Test2 {
//    public void main(String[] args) {
//        Car c = Car.createCar();
//    }
//}
//
//class Car {
//    private Car() { }
//    static Car createCar() { return new Car(); }
//}

        // Методы of() возвращают объекты соответствующего типа.
        // Ниже два способа, как можно создать объект LocalDate. Разница в месяце. В первом случае нужно указать число, а во втором случае нужно выбрать значение инам.
//        public static LodalDate of(int год, int месяц, int день)
//        public static LodalDate of(int год, Month месяц, int день)

        // Два способа как можно создать дату
//        LocalDate ld1 = LocalDate.of(2014, 3, 20); // Обычно индексация в джаве с 0, но в этом классе месяц с 1 по 12.
//        System.out.println(ld1); // 2014-03-20
//        LocalDate ld2 = LocalDate.of(2014, Month.DECEMBER, 20);
//        System.out.println(ld2); // 2014-12-20
//
//        LocalDate ld3 = LocalDate.now();
//        System.out.println(ld3); // 2021-08-29
//
//        // Три способа как можно создать время
//        LocalTime lt1 = LocalTime.of(20, 15);
//        System.out.println(lt1); // 20:15
//        LocalTime lt2 = LocalTime.of(20, 15, 33);
//        System.out.println(lt2); // 20:15:33
//        LocalTime lt3 = LocalTime.of(20, 15, 33, 555);
//        System.out.println(lt3); // 20:15:33.000000555
//
//        LocalTime lt4 = LocalTime.now();
//        System.out.println(lt4); // 00:06:14.249883500
//
//        // Шесть способов создания даты и времени
//        LocalDateTime ldt1 = LocalDateTime.of(2020, 5, 10, 8, 44);
//        System.out.println(ldt1); // 2020-05-10T08:44:00.000000000
//        LocalDateTime ldt2 = LocalDateTime.of(2020, 5, 10, 8, 44, 30);
//        System.out.println(ldt2); // 2020-05-10T08:44:30.000000000
//        LocalDateTime ldt3 = LocalDateTime.of(2020, 5, 10, 8, 44, 30, 555);
//        System.out.println(ldt3); // 2020-05-10T08:44:30.000000555
//        // В трех выше способах месяц указан числом, но можно также и инам указать. Это еще три способа. Итого шесть способов создания даты и времени.
//
//        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt1); // Этот способ в параметры принимает - на первое место - переменную даты, на втором место - переменную времени и создает дату и время
//        System.out.println(ldt4); // 2014-03-20T20:15

        // Если неправильно указать параметры в метод of, появится иксепшин: Invalid value for MonthOfYear (valid values 1 - 12): 33. Тоже самое дней касается и скорей времени тоже.

        /** Изменение объектов классов LocalDate, LocalTime, LocalDateTime.
         * Все три класса immutable. Исходные значения даты не изменяются.
         * Когда происходит изменение даты, то создается второй объект, и туда записывается новое значение,
         * а старое значение в первом объекте сохраняется неизмененным. То есть нужно сохранять новое значение
         * даты в новую переменную. Или перезаписывать в ту же переменную. Пример ниже.
         */

//         LocalDate ld10 = LocalDate.of(2014, 5, 15);
//         ld10 = ld10.plusDays(5);
//         System.out.println(ld10); // 2014-05-20
//        // Или такой вариант использовать, когда сохраняем в новую переменную
//        LocalDate ld11 = LocalDate.of(2014, 5, 15);
//        LocalDate ld12 = ld11.plusDays(6);
//        System.out.println(ld12); // 2014-05-21
//
//        LocalDate ld13 = ld12.minusDays(6);
//        System.out.println(ld13); // 2014-05-15
//
//        LocalDate ld14 = ld13.minusWeeks(2);
//        System.out.println(ld14); // 2014-05-01
//
//        LocalDate ld15 = ld14.minusMonths(1);
//        System.out.println(ld15); // 2014-04-01
//
//        LocalDate ld16 = ld15.minusYears(1);
//        System.out.println(ld16); // 2013-04-01

         /** Методы:
          * plusDays(long количество_дней) -> LocalDate
          * minusDays(long количество_дней) -> LocalDate
          *
          * plusWeeks(long количество_недель) -> LocalDate
          * minusWeeks(long количество_недель) -> LocalDate
          *
          * plusMonths(long количество_месяцев) -> LocalDate
          * minusMonths(long количество_месяцев) -> LocalDate
          *
          * plusYears(long количество_лет) -> LocalDate
          * minusYears(long количество_лет) -> LocalDate
          */

        /**
         * Выше были методы для класса LocalDate
         *
         * По аналогии будут методы для класса LocalTime
         *
         * plusHours(long количество_часов) -> LocalTime
         * minusHours(long количество_часов) -> LocalTime
         *
         * plusMinutes(long количество_минут) -> LocalTime
         * minusMinutes(long количество_минут) -> LocalTime
         *
         * plusSeconds(long количество_секунд) -> LocalTime
         * minusSeconds(long количество_секунд) -> LocalTime
         *
         * plusNanos(long количество_наносекунд) -> LocalTime
         * minusNanos(long количество_наносекунд) -> LocalTime
         *
         *
         * Методы, которые были в классах LocalDate и LocalTime будут в классе LocalDateTime,
         * так как этот класс LocalDateTime совмещает и дату, и время.
         *
         * Важно: например, есть метод - изменить минуты (добавить минуты, например) - plusMinutes().
         * Если написать 30, и если было изначально 00, то станет 30 минут.
         * Если написать 90, то если было изначально 00, то станет на 1 час 30 минут больше.
         * Также в параметры метода можно указать 3000000, тогда это уже отразится на часах, днях, и может даже месяце.
         *
         * Также важно: если используется класс LocalDate, то там будут методы для этого класса. В этом классе не будет
         * методов из класса LocalTime. Нельзя будет вызывать метод изменить часы, минуты, секунды, милисекунды.
         * Можно только изменить год, месяц, день. Аналогично для класса LocalTime. Там можно изменить время
         * и нельзя изменить дату, так как этих методов нет в этом классе.
         *
         * minus [?ma?n?s] - мАинэс (минут)
         * plus [pl?s] - плАс (плюс)
         *
         * Также есть методы сравнения даты и времени и даты+времени (для этих трех классов).
         * isAfter() - после // true или false
         * isBefore() - до // true или false
         *
         * Можно сравнить LocalDate с LocalDate. Нельзя сравнивать LocalDate с LocalTime. И наоборот.
         * Также нельзя сравнивать другой класс (дата или время) с классом LocalDateTime.
         * Можно сравнивать дату с датой, время с временем, дату+время с датой+временем.
         */




        // Ниже 2 класса. Их нужно перенести под основной класс, чтобы не было компиляционных ошибок при раскомментировании.
// class Test1 {
//
//    static void changeEmployee(LocalDate startDate, LocalDate endDate) {
//        LocalDate dateNow = startDate;
//        while(dateNow.isBefore(endDate)) {
//            System.out.println("Наступила дата " + dateNow + ". Сотрудник заменен.");
//            dateNow = dateNow.plusMonths(1);
//        }
//    }
//    public static void main(String[] args) {
//        LocalDate startDate = LocalDate.of(2016, Month.SEPTEMBER, 1);
//        LocalDate endDate = LocalDate.of(2017, Month.MAY, 31);
//        changeEmployee(startDate, endDate);
//    }
//
//    /**
//     * Вывод:
//     * Наступила дата 2016-09-01. Сотрудник заменен.
//     * Наступила дата 2016-10-01. Сотрудник заменен.
//     * Наступила дата 2016-11-01. Сотрудник заменен.
//     * Наступила дата 2016-12-01. Сотрудник заменен.
//     * Наступила дата 2017-01-01. Сотрудник заменен.
//     * Наступила дата 2017-02-01. Сотрудник заменен.
//     * Наступила дата 2017-03-01. Сотрудник заменен.
//     * Наступила дата 2017-04-01. Сотрудник заменен.
//     * Наступила дата 2017-05-01. Сотрудник заменен.
//     */
//
//    // Если нужно изменить период, то придется класс менять, а это не очень, поэтому создан ниже другой класс и там указан период.
//
//}

//class Test2 {
//
//    static void changeEmployee(LocalDate startDate, LocalDate endDate, Period period) {
//        LocalDate dateNow = startDate;
//        while(dateNow.isBefore(endDate)) {
//            System.out.println("Наступила дата " + dateNow + ". Сотрудник заменен.");
////            dateNow = dateNow.plusMonths(1); // Ранее было .plusMonths(1); Нужно прибавлять не какой-то определенный месяц и число, а период.
//              dateNow = dateNow.plus(period); // Если период будет месяц, то будет добавлять месяц, если неделя, то неделю и так далее.
//            // Методы plus и minus нужны для класса период. Чтобы отнимать или прибавлять период.
//            // Период работает с годом, месяцем, неделей, днем. Минимальный параметр - день. Нельзя работать с меньшим параметром - час, минута, секунда, милисекунда. Будет иксепшин.
//        }
//    }
//    public static void main(String[] args) {
//        LocalDate startDate = LocalDate.of(2016, Month.SEPTEMBER, 1);
//        LocalDate endDate = LocalDate.of(2017, Month.MAY, 31);
//        // Класс период. Нельзя создать объект класса период через new. Через кэнстрактэ. Так как кэнстрактэ тоже прайвэт.
////        Period period = Period.ofYears(1);// Нужно создать период и указать. Можно указывать год, месяц, день, неделя.
//        Period period = Period.ofMonths(1);
////        Period period = Period.ofWeeks(1);
////        Period period = Period.ofDays(1);
////        Period period = Period.of(1, 2, 5); // Комбинированный вариант. Период будет меняться каждый 1 год 2 месяца и 5 дней.
//        changeEmployee(startDate, endDate, period); // Добавляем третий параметр - период
//
//          При создании объекта период не работает метод чеинин метода of. Если сделать метод чеинин к методу of,
//          Сначала сделать один оф, затем к нему второй, третий, четвертый, то когда дата будет сохраняться в переменную
//          Изменение будет только по последнему of. А предыдущие не будут учитываться. Так что отдельно нужно прописывать каждый раз of.
//          Period p = Perion.ofMonths(3).ofDays(10); // 10 дней добавится, а 3 месяца нет.
//          startDate.plus(p); // 10 дней добавится, а 3 месяца нет.
//    }

/**
 *
 * Класс Period работает с датой (год, месяц, неделя, день)
 * Класс Duration работает с временем (день, час, минута, секунда, милисекунда, наносекунды). День - его здесь тоже можно менять.
 *
 * Оба класса нельзя создать как объект через new. Можно лишь вызывать метод для создания объекта.
 * Также когда изменяется объект, то он сохраняется в Period или Duration, в зависимости от того, какой класс использовался.
 *
 * милисекунда - это тысячная секунды 999
 * наносекунда - это миллиарндая секунды 999 999 999
 *
 * Duration d1 = Duration.ofDays(3); // Добавит 3 дня. Можно отнять 3 дня. Аналогия с другими периодами ниже.
 * Duration d2 = Duration.ofHours(3);
 * Duration d3 = Duration.ofMinutes(3);
 * Duration d4 = Duration.ofSeconds(3);
 * Duration d5 = Duration.ofMillis(3);
 * Duration d6 = Duration.ofNanos(3);
 */

// Если у нас есть LocalDate, то туда можно добавить LocalDate или Period,
// так как этот класс содержит аргументы по изменению даты.
// Duration работает с временем, поэтому не получится его использовать для LocalDate.
// Но у Duration есть ofDays(), и даже с таким методом не получится изменить дату LocalDate.
// Duration делался для меньшего периода, поэтому время можно менять в LocalTime или LocalDateTime.

// Методы plus и minus можно использовать для Period. Можно использовать для LocalDate и LocalDateTime. Если использовать к LocalTime, то будет иксепшин, так как Period работает с датой, а не временем.
// Методы plus и minus можно использовать для Duration. Можно использовать для LocalTime и LocalDateTime. Если использовать к LocalDate, то будет иксепшин, так как Duration работает с временем, а не датой.

// Метод чеинин не работает как для Period, так и для Duration. Сохранится только последнее значение, а прыдыдущие в методе чеинин не применятся.

//    /**
//     * Вывод:
//     * Наступила дата 2016-09-01. Сотрудник заменен.
//     * Наступила дата 2016-10-01. Сотрудник заменен.
//     * Наступила дата 2016-11-01. Сотрудник заменен.
//     * Наступила дата 2016-12-01. Сотрудник заменен.
//     * Наступила дата 2017-01-01. Сотрудник заменен.
//     * Наступила дата 2017-02-01. Сотрудник заменен.
//     * Наступила дата 2017-03-01. Сотрудник заменен.
//     * Наступила дата 2017-04-01. Сотрудник заменен.
//     * Наступила дата 2017-05-01. Сотрудник заменен.
//     */
//
//    // Если нужно изменить период, то придется класс менять, а это не очень, поэтому создан ниже другой класс и там указан период.
//
//}

/**
 * Получение информации из класса LocalDate:
 * getDayOfWeek() -> DayOfWeek // Получение дня недели той даты, которая установлена
 * getDayOfMonth() -> int // Получение дня той даты, которая установлена
 * getDayOfYear() -> int // Получает день от года. Например, если дата 1 сентября 2016, то этот метод выведет 245 день сегодня в году.
 * getMonth() -> Month // Получает месяц (словом выводит)
 * getMonthValue() -> int // Получает месяц (числом выводит)
 * getYear() -> int // Получает год
 *
 * Получение информации из класса LocalTime:
 * getHour() -> int
 * getMinute() -> int
 * getSecond() -> int
 * getNano() -> int
 *
 * Получение информации из класса LocalDateTime:
 * Данный класс включает в себя все методы из классов LocalDate и LocalTime.
 */

/**
 * Ранее было написано, что есть два класса для форматирования даты: DateFormat и SimpleDateFormat.
 * Для классов LocalDate, LocalTime, LocalDateTime создан еще один класс для форматирования даты - DateTimeFormatter.
 *
 * Данный класс находится в пэкэджэ: java.time.format.*;
 *
 * С помощью метода format() можно изменять вывод даты или времени. Пример ниже.
 */

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE; // Это инам. Есть и другие форматы для вывода даты и времени на экран.
        LocalDate ld50 = LocalDate.of(2020, 1, 10);
        System.out.println(ld50.format(d1)); // 2020-01-10
        System.out.println(d1.format(ld50)); // 2020-01-10
        // Выше 2 строки. Там переменные поменяны местами. Переменная, которая вызывает метод формат и переменная, которая в параметрах метода. Можно писать и так, и так.

        // Если у нас DateTimeFormatter.ISO_LOCAL_DATE , то мы можем форматировать только LocalDate. Если будет указан LocalTime, то будет иксепшин.

        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime ld51 = LocalTime.of(15, 33);
        System.out.println(ld51.format(d2)); // 15:33:00

        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime ld52 = LocalDateTime.of(2020, 1, 10, 15, 33);
        System.out.println(ld52.format(d3)); // 2020-01-10T15:33:00
        System.out.println(ld52.format(d1)); // 2020-01-10
        System.out.println(ld52.format(d2)); // 15:33:00

        System.out.println("---");
        System.out.println(ld52); // 2020-01-10T15:33
        System.out.println(ld52.format(DateTimeFormatter.ISO_WEEK_DATE)); // 2020-W02-5 // После года идет номер недели в году, затем день недели. Вторая неделя в году и в этот день - пятница. Выводит день недели, исходя из локали. По умолчанию она от компьютера считывается. Так что будет как обычно - если пятница, то пятница выведется, без смещения дня недели, как в других странах.

        // Также отформатировать дату можно другим способом. Пример ниже.
        // Дата
        DateTimeFormatter format1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter format2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter format3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter format4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("----");
        System.out.println(ld52); // 2020-01-10T15:33 // Обычный вывод даты
        System.out.println(format1.format(ld52)); // 10.01.2020 // SHORT
        System.out.println(format2.format(ld52)); // пятница, 10 января 2020 г. // FULL
        System.out.println(format3.format(ld52)); // 10 января 2020 г. // LONG
        System.out.println(format4.format(ld52)); // 10 янв. 2020 г. // MEDIUM

        /**
         * Строка: DateTimeFormatter shortFormat1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
         *
         * Объяснение строки
         *
         * В параметрах указываем FormatStyle.* и указываем вместо звездочки формат вывода даты
         * А до параметров написано ofLocalizedDate. Там есть и другие варианты. Можно выбрать время или дату и время.
         */

        // Время
        DateTimeFormatter format11 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        DateTimeFormatter format21 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
//        DateTimeFormatter format31 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter format41 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println("----");
        System.out.println(ld52); // 2020-01-10T15:33 // Обычный вывод даты
        System.out.println(format11.format(ld52)); // 15:33 // SHORT
//        System.out.println(format21.format(ld52)); // FULL - этот вариант для времени не работает
//        System.out.println(format31.format(ld52)); // LONG - этот вариант для времени не работает
        System.out.println(format41.format(ld52)); // 15:33:00 // MEDIUM

        // Дата и время
        DateTimeFormatter format111 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        DateTimeFormatter format211 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
//        DateTimeFormatter format311 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter format411 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("----");
        System.out.println(ld52); // 2020-01-10T15:33 // Обычный вывод даты
        System.out.println(format111.format(ld52)); // 10.01.2020, 15:33 // SHORT
//        System.out.println(format211.format(ld52)); // FULL - этот вариант для даты и времени не работает
//        System.out.println(format311.format(ld52)); // LONG - этот вариант для даты и времени не работает
        System.out.println(format411.format(ld52)); // 10 янв. 2020 г., 15:33:00 // MEDIUM

        /**
         * Метод format() есть не только у классов LocalDate, LocalTime, LocalDateTime, но и у класса
         * DateTimeFormatter, что делает возможным написание последнего выражения в следующем виде:
         * sout(f2.format(ldt));  // Переменные можно менять местами. Результат форматирования будет в обоих случаях.
         */

        // С помощью метода ofPattern() можно создать свой формат.
        DateTimeFormatter format0 = DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm:ss"); // Можно разделить дату или месяц от года или еще что-то запятой или тирре или другим символом
        System.out.println(ld52); // 2020-01-10T15:33
        System.out.println(ld52.format(format0)); //  января 10 2020, 03:33:00

        /**
         * Обозначения формата:
         *
         * Y - 2014, YY - 14, YYYY - 2014
         * M - 3, MM - 03, MMM - мар, MMMM - марта
         * w - 1, ww - 01
         * d - 4, dd - 04
         * h - 3, hh - 03 // Указано 15 часов, но выведется 3 или 03, так как 12 часовой день
         * H - 15, HH - 15 // Указано 15 часов и выведется 15, так как 24 часовой день
         * и так далее по другим вариантам: минуты, секунды, милисекунды, наносекунды.
         *
         * Ниже будет ссылка, но с нее уже скачана таблица вариантов для форматирования. Варианты под ссылкой.
         * Подробный формат даты и времени для создания своего формата:
         * https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar
         *
         * G	эра (в английской локализации — AD и BC)	н.э.
         * y	год (4-х значное число)	2020
         * yy	год (последние 2 цифры)	20
         * yyyy	год (4-х значное число)	2020
         * M	номер месяца (без лидирующих нулей)	8
         * MM	номер месяца (с лидирующими нулями, если порядковый номер месяца < 10)	04
         * MMM	трехбуквенное сокращение месяца (в соответствии с локализацией)	янв
         * MMMM	полное название месяца	Июнь
         * w	неделя в году (без лидирующих нулей)	4
         * ww	неделя в году (с лидирующими нулями)	04
         * W	неделя в месяце (без лидирующих нулей)	3
         * WW	неделя в месяце (с лидирующим нулем)	03
         * D	день в году	67
         * d	день месяца (без лидирующих нулей)	9
         * dd	день месяца (с лидирующими нулями)	09
         * F	день недели в месяце (без лидирующих нулей)	9
         * FF	день недели в месяце (с лидирующими нулями)	09
         * E	день недели (сокращение)	Вт
         * EEEE	день недели (полностью)	пятница
         * u	номер дня недели (без лидирующих нулей)	5
         * uu	номер дня недели (с лидирующими нулями)	05
         * a	маркер AM/PM	AM
         * H	часы в 24-часовом формате без лидирующих нулей	6
         * HH	часы в 24-часовом формате с лидирующим нулем	06
         * k	количество часов в 24-часовом формате	18
         * K	количество часов в 12-часовом формате	6
         * h	время в 12-часовом формате без лидирующих нулей	6
         * hh	время в 12-часовом формате с лидирующим нулем	06
         * m	минуты без лидирующих нулей	32
         * mm	минуты с лидирующим нулем	32
         * s	секунды без лидирующих нулей	11
         * ss	секунды с лидирующим нулем	11
         * S	миллисекунды	297
         * z	часовой пояс	EET
         * Z	часовой пояс в формате RFC 822	300
         */

        // У объектов класса LocalDate, LocalTime, LocalDateTime нужно брать ту информацию, которую они содержат,
        // иначе будет иксепшин. Например, объект LocalDate и сделал свой формат для даты и берем время, а времени нет
        // в LocalDate, поэтому будет иксепшин.

        // Метод parse() переводит String в объект классов LocalDate, LocalTime и LocalDateTime, если используется DateTimeFormatter.
        // Метод parse() переводит String в объект Date, если используется SimpleDateFormat

        // parse [p??z] - пАз - парсинг
        // pattern [?p?tn] - пЭтн - шаблон

        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("MM dd yyyy"); // Пэтн нужен, чтобы свою дату сконвертировать в дэфалтную
        LocalDate ld01 = LocalDate.parse("01 20 2015", format01); // Значение стрин должно быть такого же формата, как выше, где указывался формат. Также нужно после запятой указать переменной формата, если наша дата не соответствует дфалтному формату
        System.out.println(ld01); // 2015-01-20 - выводится в дэфалтном виде дата, а не в нашем. Так и должно быть. У нас есть какая-то своя дата в своем формате, как на этой строке указано, и мы создаем под эту дату формат, и потом этот формат даты конвертируется в дэфалтный формат даты и сохраняется в дэфалтный формат. Так работает форматирование. От нашего формата в дэфалтный.

        LocalDate ld02 = LocalDate.parse("2015-01-20"); // Так выглядит дэфалтный вариант даты, поэтому его форматировать не нужно. Он сразу выведется.
        System.out.println(ld02); // 2015-01-20





        // Код из телемилка для работы с датами:

//        public static List<Date> listDates(Date startDate, Date endDate) {
//            List<Date> dates = new ArrayList<>();
//            long interval = 24 * 1000 * 60 * 60;
//            long endTime = endDate.getTime();
//            long curTime = startDate.getTime();
//            while (curTime <= endTime) {
//                dates.add(new Date(curTime));
//                curTime += interval;
//            }
//            return dates;
//        }
//
//        public static Date getCurrentDateMinusDays(Long numberOfDays) {
//            Long makeOperationsForDealsBeforeDateMilliseconds = (new Date().getTime()) - (86400000L * numberOfDays);
//            Date makeOperationsForDealsBeforeDate = null;
//            try {
//                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                makeOperationsForDealsBeforeDate = formatter.parse(new SimpleDateFormat(
//                        "dd-MM-yyyy HH:mm:ss").format(new Date(makeOperationsForDealsBeforeDateMilliseconds)));
//            } catch (Exception ex) {
//                log.error("Ошибка при работе с датой: " + ex);
//            }
//            return makeOperationsForDealsBeforeDate;
//        }
//
//        public static Date convertDateAndTime(String dateAndTimeString) {
//            StringBuilder dateAndTimeStringBuilder = new StringBuilder(dateAndTimeString);
//            String day = dateAndTimeStringBuilder.substring(8,10);
//            String year = dateAndTimeStringBuilder.substring(0,4);
//            dateAndTimeStringBuilder
//                    .replace(0,4, day)
//                    .replace(6,8, year)
//                    .replace(10,11, " ");
//            Date dateAndTimeFromAdSlot = null;
//            try {
//                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                dateAndTimeFromAdSlot = formatter.parse(dateAndTimeStringBuilder.toString());
//            } catch (Exception ex) {
//                log.error("Ошибка при работе с датой: " + ex);
//            }
//            return dateAndTimeFromAdSlot;
//        }
//
//        public static Date getNewDate(int numberOfDays, Date date) {
//            Calendar instance = Calendar.getInstance();
//            instance.setTime(date);
//            instance.add(Calendar.DAY_OF_MONTH, numberOfDays);
//            Date newDate = instance.getTime();
//            return newDate;
//        }
//
//        public Date getStartOrEndDateAdSlot(int adSlotTimeStartOrEnd) {
//            String dateAdSlot = new SimpleDateFormat("dd-MM-yyyy").format(new Date(slotDate.getTime()));
//            String timeAdSlot = null;
//            if (adSlotTimeStartOrEnd == 0) {
//                timeAdSlot = new SimpleDateFormat("HH:mm:ss").format(new Date(slotTimeFrom.getTime()));
//            } else {
//                timeAdSlot = new SimpleDateFormat("HH:mm:ss").format(new Date(slotTimeTo.getTime()));
//            }
//            String dateAndTimeToAdSlot = dateAdSlot.concat(" ").concat(timeAdSlot);
//            Date dateAndTimeAdSlot = null;
//            try {
//                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                dateAndTimeAdSlot = formatter.parse(dateAndTimeToAdSlot);
//            } catch (Exception ex) {
//                log.error("Ошибка при работе с датой: " + ex);
//            }
//            return dateAndTimeAdSlot;
//        }

    }

}

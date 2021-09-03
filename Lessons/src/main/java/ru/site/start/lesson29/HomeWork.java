package ru.site.start.lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HomeWork {
    public static void main(String[] args) {

        LocalDateTime startWork = LocalDateTime.of(2020, 1, 1, 10, 00, 00);
        LocalDateTime endWork = LocalDateTime.of(2020, 1, 4, 20, 00, 00);
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofHours(1);

        HomeWork homeWork = new HomeWork();
        homeWork.smena(startWork, endWork, period, duration);
    }

    DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
    DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("HH:mm, dd/MM/yy");

    public void smena(LocalDateTime localDateTimeOne,
                      LocalDateTime localDateTimeTwo,
                      Period period,
                      Duration duration) {
        while(localDateTimeOne.isBefore(localDateTimeTwo)) {
            String startDateWithFormat1 = localDateTimeOne.format(dt1);
            String startDateWithFormat2 = localDateTimeOne.format(dt2);
            Duration duration2 = Duration.ofHours(10);
            String endDateWithFormat = localDateTimeOne.plus(duration2).format(dt2);
            String endTimeWithFormat= localDateTimeOne.plus(duration).format(dt2);
            System.out.println("Работаем с " + startDateWithFormat1 +
                    " до " + endDateWithFormat);
            System.out.println("Отдыхаем с " + startDateWithFormat2 +
                    " до " + endTimeWithFormat + "\n");
            localDateTimeOne = localDateTimeOne.plus(period);
        }
    }

}

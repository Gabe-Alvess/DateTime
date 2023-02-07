package be.intecbrussel;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
        Instant epochDate = Instant.EPOCH;
        System.out.println("Epoch date -> " + epochDate + "\n"); // -> Epoch date geeft de start datum en tijd van een operating system aan.

        Instant now = Instant.now();
        System.out.println("Now date -> " + now + "\n"); // -> Geeft tegenwoordige datum en standard tijd aan (coordinated universal time).

        LocalTime lt = LocalTime.now();
        System.out.println("Local time -> " + lt + "\n"); // -> Geeft de tegenwoordige locale tijd aan.

        LocalDate ld = LocalDate.now();
        System.out.println("Local date -> " + ld + "\n"); // -> Geeft de tegenwoordige locale datum aan.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local date and time -> " + ldt + "\n");

        LocalDateTime date = LocalDateTime.of(2018, 01, 20, 12, 30);
        System.out.println("Written date and time -> " + date + "\n");

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myFormattedDateTime = ldt.format(myFormat);
        System.out.println("Formatted date and time -> " + myFormattedDateTime + "\n");

        /*
        * yyyy-MM-dd -> 2023-02-07
        * dd/MM/yyyy -> 07/09/2023
        * dd-MMM-yyyy -> 29-Feb-2023
        * E, MMM dd yyyy -> Tue, Feb 07 2023
        */

        Duration secondsInHour = Duration.ofHours(1);
        System.out.println(secondsInHour.getSeconds() + " seconds" + "\n");

        Duration secondsInDay = Duration.ofDays(1);
        System.out.println(secondsInDay.getSeconds() + " seconds" + "\n");

        LocalDateTime newDate1 = LocalDateTime.of(2022, 8, 25, 11, 33, 15);
        LocalDateTime oldDate1 = LocalDateTime.of(2016, 8, 31, 10, 20, 55);

        Duration betweenDate = Duration.between(oldDate1, newDate1);
        System.out.println(betweenDate.getSeconds() + " seconds" + "\n");

        Period tenDays = Period.ofDays(10).plusDays(10);
        System.out.println(tenDays.getDays() + "\n");

        Period months1 = Period.ofMonths(1).plusMonths(25);
        System.out.println(months1.getMonths() + "\n");

        LocalDate newDate2 = LocalDate.of(2022, 8, 25);
        LocalDate oldDate2 = LocalDate.of(2000, 1, 1);

        Period period = Period.between(oldDate2, newDate2);
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, ");
        System.out.print(period.getDays() + " days" + "\n");

        LocalDateTime newDate3 = LocalDateTime.of(2022, 8, 25, 11, 33, 15);
        LocalDateTime oldDate3 = LocalDateTime.of(1021, 8, 31, 10, 20, 55);

        long millennia = ChronoUnit.MILLENNIA.between(oldDate3, newDate3);
        long centuries = ChronoUnit.CENTURIES.between(oldDate3, newDate3);
        long decades = ChronoUnit.DECADES.between(oldDate3, newDate3);
        long years = ChronoUnit.YEARS.between(oldDate3, newDate3);
        long months = ChronoUnit.MONTHS.between(oldDate3, newDate3);
        long weeks = ChronoUnit.WEEKS.between(oldDate3, newDate3);
        long days = ChronoUnit.DAYS.between(oldDate3, newDate3);
        long hours = ChronoUnit.HOURS.between(oldDate3, newDate3);
        long minutes = ChronoUnit.MINUTES.between(oldDate3, newDate3);
        long seconds = ChronoUnit.SECONDS.between(oldDate3, newDate3);

        System.out.println(millennia + " millennia");
        System.out.println(centuries + " centuries");
        System.out.println(decades + " decades");
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(weeks + " weeks");
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds" + "\n");

        ChronoUnit chronoUnit1 = ChronoUnit.valueOf("DAYS");

        Duration getDurationAttribute1 = chronoUnit1.getDuration();

        System.out.println("Duration Estimated : " + getDurationAttribute1 + "\n");

        ChronoUnit chronoUnit2 = ChronoUnit.valueOf("MONTHS");

        Duration getDurationAttribute2 = chronoUnit2.getDuration();

        System.out.println("Duration Estimated : " + getDurationAttribute2);
    }
}

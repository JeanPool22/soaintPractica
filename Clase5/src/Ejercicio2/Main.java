package Ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 03, 23);

        System.out.println(date);

        System.out.println("Bisiesto: " + date.isLeapYear());

        System.out.println(date.plusDays(20));

        System.out.println(date.getDayOfWeek());
    }
}

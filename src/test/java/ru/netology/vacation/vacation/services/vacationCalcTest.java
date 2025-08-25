package ru.netology.vacation.vacation.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class vacationCalcTest {

    @Test
    void shouldCalculateWithIncome10_000Expenses3_000Threshold20_000() {
        vacationCalc service = new vacationCalc();

        // подготавливаем данные
        int income = 10_000; // доход
        int expenses = 3_000; // траты
        int threshold = 20_000; // порог остатка
        int expected = 3; // ожидаемый результат

        // вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateWithIncome100_000Expenses60_000Threshold150_000() {
        vacationCalc service = new vacationCalc();

        // подготавливаем данные
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        // вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);

    }
}

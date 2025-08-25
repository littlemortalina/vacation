package ru.netology.vacation.vacation.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class vacationCalcTest {

    @Test
    void shouldCalculateWithIncome10_000Expenses3_000Threshold20_000() {
        vacationCalc service = new vacationCalc();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateWithIncome100_000Expenses60_000Threshold150_000() {
        vacationCalc service = new vacationCalc();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}

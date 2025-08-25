package ru.netology.vacation.vacation.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class vacationCalcTest {
    @ParameterizedTest
    //подготавливаем данные
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    public void testVacationMonths(int expected, int income, int expenses, int threshold) {
        vacationCalc service = new vacationCalc();

        // вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);
    }
}

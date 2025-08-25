package ru.netology.vacation.vacation.services;

public class vacationCalc {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // остаток денег
        int count = 0; // счётчик месяцев
        int month;
        for (month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++; // расчёт месяцев отдыха
                money = money - (money - expenses); // расчёт остатка денег в отпуске
            } else {
                money = money + income - expenses; // расчёт остатка денег не в отпуске
            }
        }
        return count;
    }
}

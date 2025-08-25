package ru.netology.vacation.vacation.services;

public class vacationCalc {
    public int calculate(int income, int expenses, int threshold) {
        //income = 0;
        int money = 0;
        int count = 0;
        int month;
        for (month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - (money - expenses);
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

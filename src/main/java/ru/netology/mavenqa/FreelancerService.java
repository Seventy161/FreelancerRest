package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0; // количество денег на счету
        int vacations = 0; // счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                vacations++; // увеличиваем счётчик месяцев отдыха
                money -= expenses; // тратим на обязательные расходы
                money /= 3; // уменьшаем остаток в 3 раза
            } else {
                   money += income; // зарабатываем
                   money -= expenses; // тратим на обязательные расходы
                }
            }
            return vacations;
        }
    }
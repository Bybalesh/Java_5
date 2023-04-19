package ru.netology.java_5;

public class RelaxService {

    public int calcRelax(int income, int expence, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expence) / 3;
            } else {
                money = money + income - expence;
            }
        }
        return count;
    }
}

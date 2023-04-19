package ru.netology.java_5;

public class Main {
    public static void main(String[] args) {

        RelaxService service = new RelaxService();
        System.out.println(service.calcRelax(10_000, 3000, 20_000));
    }
}
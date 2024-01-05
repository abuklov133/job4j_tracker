package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void toDrive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int person) {
        System.out.println("Количество пассажироа " + person);
    }

    @Override
    public double refuel(int fuel) {
        int price = 10;
        return fuel * price;
    }
}

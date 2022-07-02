package com.example.agro;

public abstract class Culc {
    private final double culcValue;

    public Culc(int numOfGa, double zbor, double price, double expenses) {
        this.culcValue = numOfGa * zbor * price;
    }

    public double getCulcValue() {
        return culcValue;
    }
}
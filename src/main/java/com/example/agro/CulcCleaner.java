package com.example.agro;

public class CulcCleaner extends  Culc{
    private final double culcCleaner;

    public CulcCleaner(int numOfGa, double zbor, double price) {
        super(numOfGa, zbor, price);
        this.culcCleaner = getCulcValue() - numOfGa*(450+350+300+250+1000+2350+750+550+1300+140);
    }

    public double getCulcCleaner() {
        return culcCleaner;
    }
}
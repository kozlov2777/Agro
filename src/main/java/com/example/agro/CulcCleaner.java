package com.example.agro;

public class CulcCleaner extends  Culc{
    public CulcCleaner(int numOfGa, double zbor, double price, double expenses) {
        super(numOfGa, zbor, price, expenses);
    }

    public String culcCleaner(int numOfGa, double expenses){
        return String.valueOf(getCulcValue()-numOfGa*(expenses));
    }
}
//(numOfGa * 3.3 * 3100)
package com.example.agro;

public class CulcCleaner extends  Culc{
    public String culcCleaner(int numOfGa, double zbor, double price){
        return String.valueOf(Integer.parseInt(culc(numOfGa, zbor,price))-numOfGa*(450+350+300+250+1000+2350+750+550+1300+140));
    }
}

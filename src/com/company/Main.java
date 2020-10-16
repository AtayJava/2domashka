package com.company;

public class Main {

    public static void main(String[] args) {

        Plane objectA = new Plane("Boeing", 2020);
        Airline objectB = new Airline("Аэрофлот", 2016);
        Airline objectC = new Airline("Манас", 2010);


        objectA.distance(50.8);
        objectA.getInfo();
        objectB.time(5,25);
        System.out.println(" ");
        objectC.getInfo();
        objectC.time(48,5);


    }
}

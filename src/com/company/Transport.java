package com.company;

public class Transport {
    private String name;
    private int year;
    private Color color;

    public Transport(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

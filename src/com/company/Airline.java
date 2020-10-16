package com.company;

public class Airline extends Plane {
    private Stopover stopover;
    private String locationOfAirline;


    public Airline(String name, int year) {
        super(name, year);
        this.locationOfAirline = locationOfAirline;
        this.stopover = stopover;
    }

    public Stopover getStopover() {
        return stopover;
    }

    public String getLocationOfAirline() {
        return locationOfAirline;
    }

    @Override
    public void time(int hour, double minutes) {
        super.time(hour, minutes);
    }



    }


package com.company;

public class Plane extends Transport {
    private String model;
    private Color colors;

    public Plane(String name, int year) {
        super(name, year);
        this.colors = colors;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Color getColors() {
        return colors;
    }

    public void time(int hour) {
        System.out.println("Следующий самолет прибудет через: " + hour + "ч");
    }

    public void time(int hour, double minutes) {
        System.out.println("Следующий самолет прибудет через: " + hour + "ч " + minutes + "мин");
    }

    public final void distance(double liter) {
        System.out.println("Самолет израсходовал: " + liter + "л топлива");
    }

    public void getInfo() {
        System.out.println(
                "\nНазвание : " + super.getName() +
                        "\nГод выпуска : " + super.getYear() +
                        "\nЦвет : " + Color.WHITE);


    }


}

package ru.tech;

public class Animal {
    public int weigth;
    public int high;
    public int speed;
    public int x = 0;
    public int y = 0;
    public int z = 0;

    public void move() {
        x = x + speed;
        y = y + speed;
        z = z + speed;
        System.out.println("I moved");
        System.out.println("x, y, z " + x + " " + y + " " + z);
    }
}

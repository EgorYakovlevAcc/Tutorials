package ru.tech;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Kate!");
        Dog dog = new Dog();
        dog.getGavGav();
        Fish fish = new Fish();
        fish.getBulBul();
        for (Fish fish1: getFishList()) {
            System.out.println(fish1);
            System.out.println(fish1.high);
            System.out.println(fish1.speed);
            System.out.println(fish1.weigth);
        }
    }

    public static List<Fish> getFishList(){
        List<Fish> fishList = new ArrayList<Fish>();
        for (int i = 0; i < 5; i++){
            Fish fish = new Fish();
            setFishProperties(fish);
            fishList.add(fish);
        }
        return fishList;
    }

    public static void setFishProperties(Fish fish) {
        Random random = new Random();

        fish.speed = random.nextInt();
        fish.high = random.nextInt();
        fish.weigth = random.nextInt();
    }
}

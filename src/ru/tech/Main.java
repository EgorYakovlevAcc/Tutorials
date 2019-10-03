package ru.tech;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Kate!");
        Dog dog = new Dog();
        dog.getGavGav();
        Fish fish = new Fish();
        fish.getBulBul();
        System.out.println("here is a List of fishes " + getFishList().toString());
    }

    public static List<Fish> getFishList(){
        List<Fish> fishList = new ArrayList<Fish>();
        for (int i = 0; i < 5; i++){
            Fish fish=new Fish();
            fishList.add(fish);
        }
        return fishList;
    }
}

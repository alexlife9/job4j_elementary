package ru.job4j.oop;

public class Cat {

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public String soundS() {
        String voice = "mur-mur";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);

        Cat sparky = new Cat();
        String say2 = sparky.soundS();
        System.out.println("Sparky says " + say2);
    }
}

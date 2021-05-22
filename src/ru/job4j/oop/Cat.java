package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(this.food + this.name);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.print("Кот ел ");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("котлету. Кота зовут - ");
        gav.show(); //чтобы выполнить метод объекта, нужно обратиться к имени переменой объекта и через точку написать необходимый метод

        System.out.print("Кот ел ");
        Cat black = new Cat();
        black.eat("рыбу. Кота зовут - ");
        black.giveNick("Черный");
        black.show();
    }
}
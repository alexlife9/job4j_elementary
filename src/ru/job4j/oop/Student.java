package ru.job4j.oop;

public class Student {

    public void music(String lyrics) { //метод music имеет входящий параметр lyrics типа String
        System.out.println("I can sign a song : " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe I can fly"; //создаем переменную song и записываем в нее значение
        petya.music(song); //вызываем метод music у объекта petya и передаем туда переменную song
    }
}

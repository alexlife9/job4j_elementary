package ru.job4j.oop;

public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) { //Для метода неважно как аргумент называется, главное чтобы тип совпадал, а имя объекту в пределах своего блока,  метод сам задаёт, и поэтому он становится another
        this.value = this.value + another.value; //Another - это ссылка на объект, в пределах метода. Объект один и тот же, но на него указывают две ссылки second и another.
        another.value = 6;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("сначала значение у объекта first = " + first.value + " и second = " + second.value);

        first.pour(second); //вызываем метод pour у объекта first и передаем в него переменную second
        System.out.println("first : " + first.value + " и second : " + second.value + " - после того как вызвали метод pour у объекта first и передали в него значение second.");

        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

        second.pour(first);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
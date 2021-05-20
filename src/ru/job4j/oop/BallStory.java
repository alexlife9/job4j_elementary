package ru.job4j.oop;

public class BallStory {

    public static class Ball {

        public void run1(Hare hare) {
        }

        public void run2(Wolf wolf) {
        }

        public void run3(Fox fox) {
        }
    }

    public static class Hare {
        public void tryEat(Ball ball) {
        }
    }

    public static class Wolf {
        public void tryEat(Ball ball) {
        }
    }

    public static class Fox {
        public void tryEat(Ball ball) {
        }
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.run1(hare);
        ball.run2(wolf);
        ball.run3(fox);
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}

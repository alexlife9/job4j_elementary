package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public void printInfo() {
        System.out.println("Пользователь онлайн: " + active);
        System.out.println("Кол-во сообщений на форуме: " + status);
        System.out.println("Подпись в профиле: " + message);
    }

    public static void main(String[] args) {
        Error user = new Error(true, 100, "Dum Spiro Spero");
        user.printInfo();
        Error userUnk = new Error();
        userUnk.printInfo();
    }

}
package ru.job4j.loop;

public class Print0ToN {
    public static int out(int n) {
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(out);
        }
        return n;
    }
}

//Выведите на консоль числа от 0 до N. N не входит. В этом упражнении используйте цикл for c index.
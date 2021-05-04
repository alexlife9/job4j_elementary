package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == y1 && x2 == y2) {
            int rsl1 = Math.abs(x2 - x1);
            int rsl2 = Math.abs(y2 - y1);
            rsl = (rsl2 - rsl1);
            rsl = rsl == 0 ? rsl : Math.abs(rsl2 - rsl1);
        }
        return rsl;
    }
}

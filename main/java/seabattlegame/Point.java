package main.java.seabattlegame;

public class Point {

    /** Ячейка в игре */
    protected boolean isActive;

    protected BattleMap map;

    public Point() {
        this.isActive = true;
    }

    public boolean isActive() {
        return isActive;
    }

    /**
     * Попадание - палуба уничтожена
     */
    public void hit() {
        isActive = false;
    }

    @Override
    public String toString() {
        return "пустая";
    }
}

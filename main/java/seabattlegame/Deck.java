package main.java.seabattlegame;

/**
 * Палуба корабля
 */
public class Deck extends Point {

    /** Ссыдка на корабль */
    private Ship ship;

    /** Данные о позиции палубы */
    private GPS gps;

    /**
     * Создание палубы
     * @param gps координаты типа GPS
     */
    public Deck(GPS gps, Ship ship) {
        this.gps = gps;
        this.ship = ship;
        this.isActive = true;
    }

    public Deck() {
    }

    public GPS getGps() {
        return gps;
    }

    public boolean isActive() {
        return isActive;
    }

    public Ship getShip() {
        return ship;
    }

    @Override
    public String toString() {
        return this.isActive ? CellType.DECK_TRUE.toString() : CellType.DECK_FALSE.toString();
    }
}

package main.java.seabattlegame;

/**
 * Типы ячеек для отрисовки поля битвы
 */
enum CellType {
    /** пустая ячейка */
    EMPTY      (-1, "⬜"),
    /** ореол корабля */
    SHIP_ZONE  ( 1, "\uD83D\uDFE6"),
    /** палуба корабля - живая */
    DECK_TRUE  ( 2, "\uD83D\uDEE5"),
    /** палуба корабля - подбитая */
    DECK_FALSE ( 0, "\uD83D\uDFE5");

    private int value;
    private String display;

    /**
     * Конструктор для ячейки
     * @param value id
     * @param display отображаемый символ
     */
    CellType(int value, String display) {
        this.value = value;
        this.display = display;
    }

    @Override
    public String toString() {
        return this.display;
    }
}

enum Orientation {
    SINGLE(0, "Одиночный"),
    HORIZONTAL(1, "Горизонтальный"),
    VERTICAL(2, "Вертикальный");

    private int id;
    private String display;

    Orientation(int id, String display) {
        this.id = id;
        this.display = display;
    }

    @Override
    public String toString() {
        return this.display;
    }
}
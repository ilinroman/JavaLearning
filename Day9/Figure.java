package Day9;

abstract class Figure {
    private String color;
    protected String name;

    public abstract double area();

    public abstract double perimeter();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s\n параметры: %s\n площадь: %f\n периметр: %f\n", this.name, this.color, this.area(), this.perimeter());
    }
}



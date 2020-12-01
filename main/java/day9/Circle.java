package Day9;

class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.name = "Круг";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Круг\n");
        sb.append("Параметры: ").append(super.getColor()).append("; ").append(radius).append("\n");
        sb.append("Площадь: ").append(this.area()).append("\n");
        sb.append("Периметр: ").append(this.perimeter()).append("\n");
        return sb.toString();
    }*/
}

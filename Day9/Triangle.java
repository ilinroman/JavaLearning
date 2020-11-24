package Day9;

class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = "Треугольник";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt( p * (p - a) * (p - b) * (p - c) );
        return s;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}

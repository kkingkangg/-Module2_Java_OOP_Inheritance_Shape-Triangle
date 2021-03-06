public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double size1, double side2, double side3) {
        this.side1 = size1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public double getPerimeter(){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public double getArea(){
        double halfP = (getPerimeter()/2);
        double area = Math.sqrt(halfP*(halfP- side1)*(halfP- side2)*(halfP- side3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                super.toString() +
                '}';
    }
}

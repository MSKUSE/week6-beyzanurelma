public class Triangle extends Shape {
    private Point topLeft;
    private int sideA, sideB;
    public static int counter = 0;

    public static String class_name = "Triangle";

    public Triangle(Point topLeft, int sideA, int sideB) {
        super(topLeft); 
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
    }

    public Triangle(Point topLeft, int sideA) {
        this(topLeft, sideA, sideA);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Side A cannot be zero or negative");
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side B cannot be zero or negative");
        }
        this.sideB = sideB;
    }

    public double perimeter() {
        double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        return sideA + sideB + hypotenuse;
    }

    public double area() {
        return (sideA * sideB) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Location=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counter=" + counter +
                '}';
    }
}


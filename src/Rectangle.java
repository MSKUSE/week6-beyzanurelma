class Rectangle extends Shape {
    private Point topLeft;
    private int sideA, sideB;
    public static int counter = 0;
    public int counterforobject = 0;

    public static String class_name = "Rectangle";

    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterforobject++;
    }

    public Rectangle(Point topLeft, int sideA) {
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
        if (sideA < 0) {
            throw new IllegalArgumentException("side A cannot be negative");
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            throw new IllegalArgumentException("side B cannot be negative");
        }
        this.sideB = sideB;
    }

    public int perimeter() {
        return 2 * (sideA + sideB);
    }

    public int area() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterforobject=" + counterforobject +
                '}';
    }
}


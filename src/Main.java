public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        Rectangle r1 = new Rectangle(p, 3, 4);
        System.out.println(r1.counterforobject);
        System.out.println(Rectangle.counter);
        Rectangle r2 = new Rectangle(p, 5, 6);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        System.out.println(Integer.max(3, 4));
        System.out.println(Integer.parseInt("1"));
        String a = new String("aaa");
        System.out.println(a);
        System.out.println(r1);

        Rectangle r = new Rectangle(new Point(3, 4), 5, 6);
        System.out.println(r.getTopLeft());
        System.out.println(r);

        Shape shape = new Shape(new Point(0, 0));
    }
}
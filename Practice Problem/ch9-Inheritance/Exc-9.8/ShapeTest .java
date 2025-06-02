package ch9.java;
public class ShapeTest {

    // Point class
    static class Point {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() { return x; }
        public double getY() { return y; }
    }

    // Quadrilateral class
    static class Quadrilateral {
        protected Point p1, p2, p3, p4;

        public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
        }
    }

    // Trapezoid class
    static class Trapezoid extends Quadrilateral {
        public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
            super(p1, p2, p3, p4);
        }

        public double area() {
            double height = Math.abs(p1.getY() - p3.getY());
            double base1 = Math.abs(p1.getX() - p2.getX());
            double base2 = Math.abs(p3.getX() - p4.getX());
            return 0.5 * (base1 + base2) * height;
        }
    }

    // Parallelogram class
    static class Parallelogram extends Trapezoid {
        public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
            super(p1, p2, p3, p4);
        }

        @Override
        public double area() {
            double base = Math.abs(p1.getX() - p2.getX());
            double height = Math.abs(p1.getY() - p3.getY());
            return base * height;
        }
    }

    // Rectangle class
    static class Rectangle extends Parallelogram {
        public Rectangle(Point p1, Point p2, Point p3, Point p4) {
            super(p1, p2, p3, p4);
        }

        @Override
        public double area() {
            double width = Math.abs(p1.getX() - p2.getX());
            double height = Math.abs(p1.getY() - p3.getY());
            return width * height;
        }
    }

    // Square class
    static class Square extends Rectangle {
        public Square(Point p1, Point p2, Point p3, Point p4) {
            super(p1, p2, p3, p4);
        }

        @Override
        public double area() {
            double side = Math.abs(p1.getX() - p2.getX());
            return side * side;
        }
    }

    // Main method
    public static void main(String[] args) {
        Trapezoid trap = new Trapezoid(
            new Point(0, 0), new Point(4, 0),
            new Point(1, 3), new Point(3, 3)
        );

        Parallelogram para = new Parallelogram(
            new Point(0, 0), new Point(4, 0),
            new Point(1, 3), new Point(5, 3)
        );

        Rectangle rect = new Rectangle(
            new Point(0, 0), new Point(4, 0),
            new Point(0, 3), new Point(4, 3)
        );

        Square square = new Square(
            new Point(0, 0), new Point(3, 0),
            new Point(0, 3), new Point(3, 3)
        );

        System.out.printf("Trapezoid area: %.2f%n", trap.area());
        System.out.printf("Parallelogram area: %.2f%n", para.area());
        System.out.printf("Rectangle area: %.2f%n", rect.area());
        System.out.printf("Square area: %.2f%n", square.area());
    }
}

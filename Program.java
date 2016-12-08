import java.util.ArrayList;
import java.util.List;

/**
 * Created by sontx on 12/8/2016.
 * Contact www.sontx.in
 */
public class Program {
    static abstract class Shape {
        public abstract float getArea();
    }

    static abstract class TwoDShape extends Shape {

    }

    static abstract class ThreeDShape extends Shape {
        public abstract float getVolume();
    }

    static class Circle extends TwoDShape {
        private float radius;
        @Override
        public float getArea() {
            return (float) (Math.PI * radius * radius);
        }

        public float getRadius() {
            return radius;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "circle R = " + radius;
        }
    }

    static class Cube extends ThreeDShape {
        private float width;
        @Override
        public float getArea() {
            return width * width * 6;
        }

        @Override
        public float getVolume() {
            return width * width * width;
        }

        public float getWidth() {
            return width;
        }

        public void setWidth(float width) {
            this.width = width;
        }

        @Override
        public String toString() {
            return "cube W = " + width;
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.setRadius(3393);;
        shapes.add(circle);

        Cube cube = new Cube();
        cube.setWidth(11194);
        shapes.add(cube);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof TwoDShape) {
                //System.out.println("Area: " + shape.getArea());
            } else if (shape instanceof ThreeDShape) {
                System.out.println("Volume: " + ((ThreeDShape)shape).getVolume());
            }
            System.out.println("-------------------------------");
        }
    }
}

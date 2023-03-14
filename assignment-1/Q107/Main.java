package Q107;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 5, 5);
        Sphere sphere = new Sphere(5);
        Cuboid cuboid = new Cuboid(5);

        System.out.println("The area of circle is: " + circle.calculateArea());
        System.out.println("The area of square is: " + square.calculateArea());
        System.out.println("The area of triangle is: " + triangle.calculateArea());
        System.out.println("The area of sphere is: " + sphere.calculateArea());
        System.out.println("The volume of sphere is: " + sphere.calculateVolume());
        System.out.println("The area of cuboid is: " + cuboid.calculateArea());
        System.out.println("The volume of cuboid is: " + cuboid.calculateVolume());
    }
}

interface calcArea {
    float calculateArea();
}

interface calcVolume {
    float calculateVolume();
}

class Circle implements calcArea {
    final float pi = 3.14f;
    private float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return this.pi * this.radius * this.radius;
    }

}

class Square implements calcArea {
    private float side;

    Square(float side) {
        this.side = side;
    }

    @Override
    public float calculateArea() {
        return this.side * this.side;
    }
}

class Triangle implements calcArea {
    private float side1, side2, side3;

    Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float calculateArea() {
        float s = (this.side1 + this.side2 + this.side3) / 2;
        float f = (s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return (float) Math.sqrt(f);
    }
}

class Sphere implements calcArea, calcVolume {
    final float pi = 3.14f;
    private float radius;

    Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return this.pi * this.radius * this.radius;
    }

    @Override
    public float calculateVolume() {
        return (float) ((4.0f / 3.0f) * this.pi * Math.pow(this.radius, 3));
    }
}

class Cuboid implements calcArea, calcVolume {
    private float side;

    Cuboid(float side) {
        this.side = side;
    }

    @Override
    public float calculateArea() {
        return this.side * this.side;
    }

    @Override
    public float calculateVolume() {
        return (float) Math.pow(this.side, 3);
    }
}

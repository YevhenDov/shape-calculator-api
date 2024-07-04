package areacalculator.entity;

import areacalculator.enums.ShapeType;

public class Circle extends Shape {

    private final double radius;


    public Circle(double radius) {
        super(ShapeType.CIRCLE);

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

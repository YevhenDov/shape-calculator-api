package areacalculator.entity;

import areacalculator.enums.ShapeType;

public class Square extends Shape{

    private final double side;

    public Square(double side) {
        super(ShapeType.SQUARE);

        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

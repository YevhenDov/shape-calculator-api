package areacalculator.entity;

import areacalculator.enums.ShapeType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {

    ShapeType shapeType;

    protected Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
